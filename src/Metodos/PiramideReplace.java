package Metodos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PiramideReplace {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\";

    public static void removerPiramide(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() > 206 && cor.getGreen() > 241 && cor.getBlue() > 243) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

                if (cor.getRed() > 186 && cor.getGreen() > 131 && cor.getBlue() > 173) {

                    novaImagem.setRGB(linha, coluna, pixel);
                }
            }



            String caminho = CAMINHO_PADRAO + "Piramide_novo.png";

            ImageIO.write(novaImagem, "png", new File(caminho));
            JFrame janela = new JFrame();
            ImageIcon icon = new ImageIcon(novaImagem);
            JLabel label = new JLabel(icon);
            janela.add(label);
            janela.pack();
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
        }
    }
}


