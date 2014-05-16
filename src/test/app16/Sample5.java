package test.app16;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Sample5 {
	public static void main(String[] args) throws Exception{
        String fileName = "sample.png";
        int blackCount = 0;
        File imageFile = new File(fileName);
        BufferedImage image = ImageIO.read(imageFile);
  
        int width = image.getWidth();
        int height = image.getHeight();
        int[] rgbArray = new int[width * height];
        int offset = 0;
        int scansize = width;
        image.getRGB(0, 0, width, height, rgbArray, offset, scansize);
    
        LOOP_RGBARRAY:
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = rgbArray[y * width + x];
                    if (pixel == -16777216) {
                        blackCount++;
                    }
                    if (blackCount == 64000) {
                        System.out.println("break LOOP_RGBARRAY");
                        break LOOP_RGBARRAY;
                    }
                    Color c = new Color(pixel);
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    System.out.print("("+x+","+y+")="+pixel+" ");
                }
                System.out.println("");
            }
    }

}
