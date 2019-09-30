package controller;

import java.awt.Point;
import java.util.ArrayList;

public class Sistema {

	public void teste()
	{
		
		
		
	}

	
	/**
	 * 
	 */
	public static ArrayList<Point> pontosTeste()
	{
		ArrayList<Point> graphPoints = new ArrayList<>();
	
		
		
		graphPoints.add(new Point((0), (600)));
		graphPoints.add(new Point(1, 590));
		graphPoints.add(new Point((2), (580)));
		graphPoints.add(new Point((3), (590)));
		graphPoints.add(new Point((4), (600)));
		graphPoints.add(new Point((5), (590)));
		graphPoints.add(new Point((6), (580)));
		graphPoints.add(new Point((7), (600)));
		graphPoints.add(new Point((8), (620)));
		graphPoints.add(new Point((9), (610)));
		graphPoints.add(new Point((10), (600)));
		graphPoints.add(new Point((11), (610)));
		graphPoints.add(new Point((12), (620)));
		graphPoints.add(new Point((13), (610)));

		graphPoints.add(new Point((14), (600)));
		graphPoints.add(new Point((15), (580)));

		graphPoints.add(new Point((16), (560)));
		graphPoints.add(new Point((17), (580)));

		graphPoints.add(new Point((18), (600)));
		graphPoints.add(new Point((19), (590)));

		graphPoints.add(new Point((20), (580)));
		graphPoints.add(new Point((21), (630)));

		graphPoints.add(new Point((22), (680)));
		double menor = Integer.MAX_VALUE;
		double maior =0 ;
		for(int i=0;i<graphPoints.size();i++)
		{
			if(graphPoints.get(i).getY() < menor)
				menor = graphPoints.get(i).getY();
			if(graphPoints.get(i).getY()>maior)
				maior = graphPoints.get(i).getY();
		}
		
		return graphPoints;
	}
	public static ArrayList<Point> pontosTest2()
	{
		ArrayList<Point> graphPoints = new ArrayList<>();

		
		
		graphPoints.add(new Point((0), (600)));
		graphPoints.add(new Point((2), (580)));
		graphPoints.add(new Point((4), (600)));
		graphPoints.add(new Point((6), (580)));
		graphPoints.add(new Point((8), (620)));
		graphPoints.add(new Point((10), (600)));
		graphPoints.add(new Point((12), (620)));
		graphPoints.add(new Point((14), (600)));
		graphPoints.add(new Point((16), (560)));
		graphPoints.add(new Point((18), (600)));
		graphPoints.add(new Point((20), (580)));
		graphPoints.add(new Point((22), (680)));
		double menor = Integer.MAX_VALUE;
		double maior =0 ;
		for(int i=0;i<graphPoints.size();i++)
		{
			if(graphPoints.get(i).getY() < menor)
				menor = graphPoints.get(i).getY();
			if(graphPoints.get(i).getY()>maior)
				maior = graphPoints.get(i).getY();
		}
		
		return graphPoints;
	}
	
}
