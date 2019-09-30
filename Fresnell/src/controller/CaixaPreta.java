package controller;

import java.awt.Point;
import java.util.ArrayList;

public class CaixaPreta {

	private ArrayList<Point> relevo = Sistema.pontosTeste();
	private Point antenaA ;
	private Point antenaB ;
	public ArrayList<Point> getRelevo() {
		return relevo;
	}

	public void setRelevo(ArrayList<Point> relevo) {
		this.relevo = relevo;
	}

	public Point getAntenaA() {
		return antenaA;
	}

	public void setAntenaA(Point antenaA) {
		this.antenaA = antenaA;
	}

	public Point getAntenaB() {
		return antenaB;
	}

	public void setAntenaB(Point antenaB) {
		this.antenaB = antenaB;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	private double frequencia =10000;
	public CaixaPreta()
	{
		
	}
	
	public void fresnel()
	{
            System.out.println("Relevo" + getRelevo().size());
            for(Point a : Calculo.corrigeRelevo(getRelevo()))
            {
                System.out.println(a.getY());
            }
		Calculo.obstrucaoFresnel(Calculo.fresnell(antenaA, antenaB, frequencia), getRelevo());//Ok?
		GuiFresnell g = new GuiFresnell();
		g.inicia(Calculo.corrigeRelevo(getRelevo()), Calculo.fresnell(antenaA, antenaB, frequencia), null);
	}
}
