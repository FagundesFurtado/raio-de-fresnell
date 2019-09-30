package model;

import java.util.ArrayList;

public class Cores {

    private final Cor azul;
    private final Cor vermelho;
    private final Cor preto;
    private final Cor verde;

    private ArrayList<Cor> cores;

    public Cores() {
        cores = new ArrayList<>();

        vermelho = new Cor(255, 0, 0, 920);
        verde = new Cor(0, 255, 0, 940);
        azul = new Cor(0, 0, 255, 980);
        preto = new Cor(0, 0, 0, 960);
        cores.add(vermelho);
        cores.add(azul);
        cores.add(preto);
        cores.add(verde);

    }

    public int getAltura(int red, int green, int blue) {
        for (Cor c : cores) {
            if (c.isSame(red, green, blue)) {
                return c.getAltura();
            }
        }
        return 0;
    }

}
