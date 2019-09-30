package controller;

import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Calculo {

    public static ArrayList<Point> fresnell(Point antenaA, Point antenaB, double frequencia) {

        ArrayList<Point> p = new ArrayList<>();
        for (int i = 0; i <= (int) (distanciaX(antenaA, antenaB)); i++) {

            double y = 547 * Math.sqrt(((distanciaX(antenaA, antenaB) - (double) (i)) * (double) (i)) / (frequencia * distanciaX(antenaA, antenaB)));
            p.add(new Point(i, (int) (equacaoDaReta(antenaA, antenaB, i) - y)));

        }

        return p;
    }

    public static ArrayList<Point> corrigeRelevo(ArrayList<Point> pontos) {
        ArrayList<Point> altimetria = new ArrayList<>();
        for (int i = 0; i < pontos.size() - 1; i++) {
            Point media = new Point();
            double x = (pontos.get(i + 1).getX() + pontos.get(i).getX()) / 2;
            double y = (pontos.get(i + 1).getY() + pontos.get(i).getY()) / 2;
            //	System.out.println("X "+x+" Y "+y);
            media.setLocation(x, y);
            altimetria.add(pontos.get(i));
            altimetria.add(media);
        }
        altimetria.add(pontos.get(pontos.size() - 1));

        return altimetria;

    }

    static double distancia(Point antenaA, Point antenaB) {
        double catA = Math.pow(antenaA.getY() - antenaB.getY(), 2);
        double catB = Math.pow(antenaA.getX() - antenaB.getX(), 2);
        return Math.sqrt(catA + catB);
    }

    private static double distanciaX(Point antenaA, Point antenaB) {
        return Math.sqrt(Math.pow(antenaA.getX() - antenaB.getX(), 2));
    }

    public static double equacaoDaReta(Point antenaA, Point antenaB, double x) {

        return coeficiente(antenaA, antenaB) * x - antenaA.getX() * coeficiente(antenaA, antenaB) + antenaA.getY();
    }

    public static double obstrucaoFresnel(ArrayList<Point> fresnell, ArrayList<Point> relevo) {

        ArrayList<Double> obstrucoes = new ArrayList<>();

        for (int i = 0; i < fresnell.size(); i++) {
            if (relevo.get(i).getY() >= fresnell.get(i).getY()) {
                obstrucoes.add(relevo.get(i).getX());
            }
        }

        if (!obstrucoes.isEmpty()) {
            String valores = "Obstrucoes: ";

            for (Double d : obstrucoes) {
                valores += " " + d;
            }
            JOptionPane.showMessageDialog(null, valores);
        }

        return 0.;
    }

    private static double coeficiente(Point antenaA, Point antenaB) {
        double deltaY;
        double deltaX;
        if (antenaA.getX() > antenaB.getX()) {
            deltaY = (antenaA.getY() - antenaB.getY());
            deltaX = (antenaA.getX() - antenaB.getX());

        } else {
            deltaY = (antenaB.getY() - antenaA.getY());
            deltaX = (antenaB.getX() - antenaA.getX());
        }

        return deltaY / deltaX;
    }
}
