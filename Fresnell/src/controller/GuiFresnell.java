package controller;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;



public class GuiFresnell extends ApplicationFrame {


    public GuiFresnell() {
        super("Raio de Fresnell");
    }
    
    public GuiFresnell(final String title, ArrayList<Point> relevo, ArrayList<Point> fresnell, ArrayList<Point> obstrucao) {
        
        super(title);
        
        final XYDataset dataset = createDataset(relevo, fresnell, obstrucao);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
        
    }


    private XYDataset createDataset(ArrayList<Point> relevo, ArrayList<Point> fresnell, ArrayList<Point> obstrucao) {

        final XYSeries series2 = new XYSeries("Fresnel");
        
        for (int i = 0; i < fresnell.size(); i++) {
            
            series2.add(fresnell.get(i).getX(), fresnell.get(i).getY());
            
        }
        
        final XYSeries series3 = new XYSeries("Relevo");
        
        final XYSeries linha = new XYSeries("Linha Fresnel");
        
        linha.add(fresnell.get(0).getX(), fresnell.get(0).getY());
        linha.add(fresnell.get(fresnell.size() - 1).getX(), fresnell.get(fresnell.size() - 1).getY());
       
        
        
        
        for (int i = 0; i < relevo.size(); i++) {
            series3.add(relevo.get(i).getX(), relevo.get(i).getY());
        }
        
        final XYSeriesCollection dataset = new XYSeriesCollection();
        
        dataset.addSeries(series2);
        
        dataset.addSeries(series3);
        
        dataset.addSeries(linha);
        
        return dataset;
        
    }

     private JFreeChart createChart(final XYDataset dataset) {

        final JFreeChart chart = ChartFactory.createXYLineChart(
                "Raio de Fresnell", // chart title
                "X", // x axis label
                "Y", // y axis label
                dataset, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips
                false // urls
        );
        
        chart.setBackgroundPaint(Color.white);

          final XYPlot plot = chart.getXYPlot();
        
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, true);
        renderer.setSeriesShapesVisible(0, true);
        chart.getXYPlot().setRenderer(1, new XYSplineRenderer());
        
        renderer.setSeriesLinesVisible(1, true);
        renderer.setSeriesShapesVisible(1, false);
        
        renderer.setSeriesLinesVisible(2, true);
        renderer.setSeriesShapesVisible(2, false);
        
        plot.setRenderer(renderer);

        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
   
        return chart;
        
    }
    
    public void inicia(ArrayList<Point> relevo, ArrayList<Point> fresnell, ArrayList<Point> obstrucao) {
        
        final GuiFresnell demo = new GuiFresnell("Raio de Fresnell", relevo, fresnell, obstrucao);
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
        
    }
    
}
