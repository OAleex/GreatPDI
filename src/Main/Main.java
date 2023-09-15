package Main;

import Metodos.ExtrairCores;
import Metodos.FundoImagem2;
import Metodos.PiramideReplace;
import Metodos.ThreadsReplace;
//import Metodos.OceanoParaZebra;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedImage bandas = ImageIO.read(
                new File("C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\12-Cores.png"));



        ExtrairCores.extrairBranco(bandas);
        ExtrairCores.extrairVermelho(bandas);
        ExtrairCores.extrairMarromClaro(bandas);
        ExtrairCores.extrairBege(bandas);
        ExtrairCores.extrairVerde(bandas);
        ExtrairCores.extrairVerdeClaro(bandas);
        ExtrairCores.extrairCinza(bandas);
        ExtrairCores.extrairVerdeMaisClaro(bandas);
        ExtrairCores.extrairAzulEscuro(bandas);
        ExtrairCores.extrairAzulClaro(bandas);
        ExtrairCores.extrairRoxoClaro(bandas);
        ExtrairCores.extrairBege2(bandas);

        BufferedImage bandas2 = ImageIO.read(
                new File("C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\imagem2.jpg"));
        FundoImagem2.removerImagem2(bandas2);

        BufferedImage bandas3 = ImageIO.read(
                new File("C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\threads-logo.png"));
        ThreadsReplace.removerCorThreads(bandas3);

        BufferedImage bandas4 = ImageIO.read(
                new File("C:\\Users\\Administrator\\IdeaProjects\\GreatPDI\\src\\Imagens\\imagem3.jpg"));
        PiramideReplace.removerPiramide(bandas4);
    }
}


