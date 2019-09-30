package controller;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import model.Cores;

public class LeituraImagem {

    int altimetria[][];
    int alturaImagem = 20;
    Cores cor = new Cores();

    public LeituraImagem() {
        try {
            lerImagem();
        } catch (IOException ex) {
            Logger.getLogger(LeituraImagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void lerImagem() throws IOException {
        //    File f = new File("src\\imagem\\baseDados.png");
        File f = new File("src/imagem/baseDados.png");
        Color color;

        BufferedImage buffer;
        buffer = ImageIO.read(f);
        //alturaImagem = buffer.getHeight();
        altimetria = new int[buffer.getWidth()][buffer.getHeight()];
        int i = 0;
        int k = 0;
        for (i = 0, k = 0; i < buffer.getHeight(); i++, k++) {
            for (int j = buffer.getWidth() - 1; j >= 0; j--) {
                color = new Color(buffer.getRGB(i, j));

                altimetria[k][j] = cor.getAltura(color.getRed(), color.getGreen(), color.getBlue());

            }
        }
    }

    public ArrayList<Point> extrairPontos(int x, int y, int xFinal, int yFinal) {
        ArrayList<Point> altimetriaPontos = new ArrayList<>();
        if (xFinal != x) {
            float inclinacao = (yFinal - y) / (xFinal - x);

            for (int c = x; c <= xFinal; c++) {
                int pontoY = (int) (inclinacao * (c - x) + y);

                pontoY = Math.abs(alturaImagem - pontoY);

                Point novo = new Point(c, altimetria[c][pontoY]);
                altimetriaPontos.add(novo);

            }
        } else {
            for (int c = y; c <= yFinal; c++) {
                int pontoY = Math.abs(alturaImagem - c);
                Point novo = new Point(x, altimetria[x][pontoY]);
                altimetriaPontos.add(novo);
            }

        }

        return altimetriaPontos;

    }

    public int altura(int x, int y) {
        return altimetria[x][Math.abs(alturaImagem - y)];
    }

}
