import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class ironuki {
    public static void main(String[] args) throws IOException {
        File f = new File("humen_rei.png");
        //File f = new File("iro1.png");
        BufferedImage read=ImageIO.read(f);
        int w = read.getWidth(),h = read.getHeight();
        BufferedImage write =
                new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

        for(int y = 0;y<h; y++){
            for(int x=0;x<w;x++){
                int c = read.getRGB(x, y);
                int r = ImageUtility.r(c);
                int g = ImageUtility.g(c);
                int b = ImageUtility.b(c);
                System.out.println("r="+r);
                System.out.println("g="+g);
                System.out.println("b="+b);
                System.out.println("-----");
                //if(r>=245 && r<=250 && g>=245 && g<=250 && b>=245 && b<=250){
                //if(r==51 && g==51 && b==50){
                  //r=0;g=0;b=0;
                //} else {r=255;g=255;b=255;}
                if(r>=50 && r<=52 && g>=50 && g<=52 && b>=50 && b<=52){ //境界線判定(範囲指定)
                  r=0;g=0;b=0;
                } else {r=255;g=255;b=255;}
                //if(r==0 && g==0 && b==0){
                  //r=0;g=0;b=0;
                //} else {r=255;g=255;b=255;}
                int rgb = ImageUtility.rgb(r,g,b);
                write.setRGB(x,y,rgb);
            }
        }

        File f2 = new File("test6.png");
        ImageIO.write(write, "jpg", f2);
    }
}
