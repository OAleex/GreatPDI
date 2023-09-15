//package Metodos;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//public class OceanoParaZebra {
//
//    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\";
//
//
//    public static void substituirCor(BufferedImage imagem) throws IOException {
//
//        int largura = imagem.getWidth();
//        int altura = imagem.getHeight();
//
//
//        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
//
//        for (int linha = 0; linha < largura; linha++) {
//            for (int coluna = 0; coluna < altura; coluna++) {
//
//                int pixel = imagem.getRGB(linha, coluna);
//                Color cor = new Color(pixel);
//
//                if (cor.getRed() >= 255 && cor.getGreen() >= 255 && cor.getBlue() >= 255) {
//
//                    novaImagem.setRGB(linha, coluna, pixel);
//
//                } else {
//                    Color corAzul = new Color(30, 104, 149);
//                    int pixelAzul = corAzul.getRGB();
//                    novaImagem.setRGB(linha, coluna, pixelAzul);
//
//                }
//
//            }
//
//        }
//
//
//        String caminho = CAMINHO_PADRAO + "ZebraNoOceanoGlubGlub.png";
//
//        ImageIO.write(novaImagem, "png", new File(caminho));
//        JFrame janela = new JFrame();
//        ImageIcon icon = new ImageIcon(novaImagem);
//        JLabel label = new JLabel(icon);
//        janela.add(label);
//        janela.pack();
//        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        janela.setVisible(true);
//    }
//
//
//}
