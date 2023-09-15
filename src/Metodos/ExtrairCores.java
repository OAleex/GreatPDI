package Metodos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ExtrairCores {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\";

    public static void extrairBranco(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() >= 255 && cor.getGreen() >= 255 && cor.getBlue() >= 255) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);

                }

            }

        }


        String caminho = CAMINHO_PADRAO + "Branco.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairVermelho(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 150 && cor.getGreen() == 0 && cor.getBlue() == 0) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "Vermelho.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairMarromClaro(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 150 && cor.getGreen() == 100 && cor.getBlue() == 0) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "MarromClaro.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairBege(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 150 && cor.getGreen() == 100 && cor.getBlue() == 100) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "Bege.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairVerde(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 0 && cor.getGreen() == 150 && cor.getBlue() == 0) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "Verde.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairVerdeClaro(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 0 && cor.getGreen() == 150 && cor.getBlue() == 100) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "VerdeClaro.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairCinza(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 100 && cor.getGreen() == 100 && cor.getBlue() == 100) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "Cinza.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairVerdeMaisClaro(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 100 && cor.getGreen() == 150 && cor.getBlue() == 100) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "VerdeMaisClaro.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairAzulEscuro(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 0 && cor.getGreen() == 0 && cor.getBlue() == 150) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "AzulEscuro.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairAzulClaro(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 0 && cor.getGreen() == 100 && cor.getBlue() == 150) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "AzulClaro.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairRoxoClaro(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 100 && cor.getGreen() == 100 && cor.getBlue() == 150) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "RoxoClaro.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairBege2(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                if (cor.getRed() == 150 && cor.getGreen() == 150 && cor.getBlue() == 150) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

            }

        }


        String caminho = CAMINHO_PADRAO + "Bege2.png";

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
