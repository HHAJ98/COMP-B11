import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JComponent;

/**
* This program repeatedly draws the image specified in a URL,
* calling Array2dDraw.shiftArray() before each redraw.
*
* @author 			Hal Mendoza
* Course: 			COMP B11
* Created: 			Mar 25, 2017
* Source File:		DrawArray2D.java
*/

public class DrawArray2D {
   static int [][] image = null;

   /**
    * Initialize image, using input as source
    * @param input a URL that specifies that source of the image
    */
   public static void initializeImage(String input) {
      BufferedImage imageIn;
      try {
         URL url = new URL(input);
         imageIn = ImageIO.read(url);
         int width = imageIn.getWidth();
         int height = imageIn.getHeight();
         image = new int[height][width];

         System.out.printf("width=%d height=%d\n", width, height);
         for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
               image[row][col] = imageIn.getRGB(col, row);
            }
         }
      } catch (MalformedURLException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }
   /**
    * Draws image
    * @param g Graphics object
    */
   public static void draw(Graphics g) {
      int width = image[0].length;
      int height  = image.length;
      BufferedImage bufferedImage =
                new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
      for (int row = 0; row < height; row++) {
         bufferedImage.setRGB(0, row, image[row].length, 1, image[row], 0, width);
//         for (int col = 1; col < image[row].length; col++) {
//            bufferedImage.setRGB(col, row, image[row][col]);
//         }
      }
      g.drawImage(bufferedImage, 0, 0, null);
   }

	public static void main(String[] args) {
	   String url;
      if (args.length > 0)
         url = args[0];
      else
         url = "http://cassavafilms.com/wp-content/uploads/2013/02/dinosaur.jpg";
      if (image == null) {
         initializeImage(url);
      }
      JFrame frame = new JFrame();

      int width = image[0].length;
      int height = image.length;
      frame.setSize(width, height);
      frame.setResizable(false);
      frame.setTitle("Hal Mendoza"); // Change to your name
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new JComponent() {
         private static final long serialVersionUID = 5384931283626878754L;

         public void paintComponent(Graphics graph) {
            draw(graph);
         }
      };

      frame.add(component);
      frame.setVisible(true);
      for (int i = 0; i < 10000; ++i) {
         if(i % 1 == 0)Array2dShift.shiftArray(image);
         frame.repaint();
         try {
            Thread.sleep(12);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
