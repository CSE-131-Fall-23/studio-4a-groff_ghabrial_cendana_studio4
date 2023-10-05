package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(199, 235, 70); //body
		StdDraw.filledEllipse(.5, .5, .25, .25);
		
		StdDraw.setPenColor(199,0,57); //bottom smile
		StdDraw.filledEllipse(.5, .4, .175, .125);
		
		StdDraw.setPenColor(199, 235, 70); //top smile
		StdDraw.filledEllipse(.5, .5, .175, .125); 
		
		StdDraw.setPenColor(Color.white); //eye
		StdDraw.filledEllipse(.5, .55, .13, .115); 
		
		StdDraw.setPenColor(0, 128, 128); //pupil
		StdDraw.filledEllipse(.5, .55, .05, .05); 
		
		StdDraw.setPenColor(Color.BLACK); //pupil
		StdDraw.filledEllipse(.5, .55, .0275, .0275); 
		
		StdDraw.setPenColor(Color.white); //pupil
		StdDraw.filledEllipse(.525, .575, .0075, .0075); 
		
		StdDraw.setPenColor(199, 235, 70); //leg
		StdDraw.filledRectangle(.4, .15, .02, .13);
		
		StdDraw.setPenColor(199, 235, 70); //leg 2
		StdDraw.filledRectangle(.6, .15, .02, .13); 
		
		StdDraw.setPenColor(199, 235, 70); //arm
		StdDraw.filledRectangle(.8, .5, .13, .02);
		
		StdDraw.setPenColor(199, 235, 70); //arm 2
		StdDraw.filledRectangle(.2, .5, .13, .02); 
		
		StdDraw.setPenColor(199, 235, 70); //feet
		StdDraw.filledRectangle(.65, .04, .065, .02);
		
		StdDraw.setPenColor(199, 235, 70); //feet
		StdDraw.filledRectangle(.35, .04, .065, .02); 
		
		StdDraw.setPenColor(199, 235, 70); //arm
		StdDraw.filledRectangle(.09, .64, .02, .13);
		
		StdDraw.setPenColor(199, 235, 70); //arm
		StdDraw.filledRectangle(.91, .64, .02, .13); 
	}
}