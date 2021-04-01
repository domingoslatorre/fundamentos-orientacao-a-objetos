package _00_revisao.modularizacao;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProcess {

    public static void main(String[] args) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("image.png"));

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        for(int i = 0; i < largura; i++) {
            for(int j = 0; j < altura; j++) {
                Color color = new Color(imagem.getRGB(i, j));
                int gray = (int) (0.2989 * color.getRed() + 0.5870 * color.getGreen() + 0.1140 * color.getBlue());
                System.out.println(gray);
                imagem.setRGB(i, j, new Color(gray, gray, gray).getRGB());
                
//                if (color.getRed() <=127 || color.getGreen() <=127 || color.getBlue() <=127) {
//                    imagem.setRGB(i, j, Color.BLACK.getRGB());
//                } else {
//                    imagem.setRGB(i, j, Color.WHITE.getRGB());
//                }
            }
        }

        ImageIO.write(imagem, "png", new File("image_gs.png"));



        BufferedImage imagem2 = ImageIO.read(new File("image.png"));

        for(int i = 0; i < largura; i++) {
            for(int j = 0; j < altura; j++) {
                Color color = new Color(imagem2.getRGB(i, j));
                int gray = (int) (0.2989 * color.getRed() + 0.5870 * color.getGreen() + 0.1140 * color.getBlue());
                if(gray > 127) {
                    imagem2.setRGB(i, j, Color.WHITE.getRGB());
                } else {
                    imagem2.setRGB(i, j, Color.BLACK.getRGB());
                }
            }
        }

        ImageIO.write(imagem2, "png", new File("image_bw.png"));

        BufferedImage imagem3 = ImageIO.read(new File("image.png"));

        for(int i = 0; i < largura; i++) {
            for(int j = 0; j < altura; j++) {
                Color color = new Color(imagem3.getRGB(i, j));
                int gray = (int) (0.2989 * color.getRed() + 0.5870 * color.getGreen() + 0.1140 * color.getBlue());
                if(gray > 127) {
                    Color newColor = new Color(151, 11, 250);
                    imagem3.setRGB(i, j, newColor.getRGB());
                } else {
                    imagem3.setRGB(i, j, Color.BLACK.getRGB());
                }
            }
        }

        ImageIO.write(imagem3, "png", new File("image_bc.png"));


    }
}
