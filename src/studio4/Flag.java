package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color green1 = new Color(22,155,98);
	
		StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(green1);
        StdDraw.filledRectangle(.2, .3, 0.1, 0.2);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(.4, .3, 0.1, 0.2);
        Color orange = new Color(255,136,62);
        StdDraw.setPenColor(orange);
        StdDraw.filledRectangle(.6, .3, 0.1, 0.2);
         
        
		
	}
}