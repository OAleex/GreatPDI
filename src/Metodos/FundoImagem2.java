package Metodos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FundoImagem2 {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\";

    public static void removerImagem2(BufferedImage imagem) throws IOException {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);


                int limitarVermelho = 200;
                int limitarVerde = 200;
                int limitarAzul = 150;

                if (cor.getRed() >= limitarVermelho && cor.getGreen() <= limitarVerde && cor.getBlue() <= limitarAzul) {
                    novaImagem.setRGB(linha, coluna, pixel);
                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }
            }

        }



        String caminhoSaida = CAMINHO_PADRAO + "imagem2_sem_fundo.jpg";

        ImageIO.write(novaImagem, "png", new File(caminhoSaida));

        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}