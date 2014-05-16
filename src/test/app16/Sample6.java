package test.app16;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
 
import javax.imageio.ImageIO;
public class Sample6 {
	 public static void main(String[] args) throws Exception{
	        String fileName = "sample.png";
	        File imageFile = new File(fileName);
	        BufferedImage image = ImageIO.read(imageFile);
	  
	        int width = image.getWidth();
	        int height = image.getHeight();
	        int[] rgbArray = new int[width * height];
	        int offset = 0;
	        int scansize = width;
	        image.getRGB(0, 0, width, height, rgbArray, offset, scansize);
	    
	        BufferedWriter writer = null;
	        try {
	            String encoding = "UTF-8";
	            writer = new BufferedWriter(new OutputStreamWriter(
	                new FileOutputStream(new File(fileName + ".html")),
	                encoding));
	            writeHtml(rgbArray, width, height, writer);
	        } finally {
	            if (writer != null) {
	                writer.close();
	            }
	        }
	    }
	    private static void writeHtml(int[] rgbArray, int width, int height, BufferedWriter writer) 
	    throws IOException {
	        writer.write("<html><head><meta http-equiv='content-type' ");
	        writer.write("content='text/html;charset=UTF-8'></head>");
	        writer.write("<body style='padding:0px; margin:0px;font-size:xx-small;'>");
	        writer.write("<pre style='overflow: auto; white-space: pre-wrap;'>\n");
	        for (int y = 0; y < height; y++) {
	            for (int x = 0; x < width; x++) {
	                int pixel = rgbArray[y * width + x];
	                Color c = new Color(pixel);
	                int r = c.getRed();
	                int g = c.getGreen();
	                int b = c.getBlue();
	                writer.write("<span style='background-color: #");
	                writer.write(toHex(r, g, b) + "; color: #");
	                writer.write(toHex(r, g, b) + ";");
	                writer.write("'>Å°</span>");
	            }
	            writer.write("\n");
	        }
	        writer.write("</pre></body></html>");
	        writer.flush();
	    }
	  
	    private static String toHex(int r, int g, int b) {
	        StringBuilder sb = new StringBuilder();
	        sb.append(Integer.toHexString(r/16));
	        sb.append(Integer.toHexString(r%16));
	        sb.append(Integer.toHexString(g/16));
	        sb.append(Integer.toHexString(g%16));
	        sb.append(Integer.toHexString(b/16));
	        sb.append(Integer.toHexString(b%16));
	        return sb.toString();
	    }

}
