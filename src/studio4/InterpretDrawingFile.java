package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapetype = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isfilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double HalfWidth = in.nextDouble();
		double HalfHeight = in.nextDouble();

		if (shapetype.equals("triangle")) {
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] xvalues = {x,HalfWidth,x3};
			double[] yvalues = {y,HalfHeight,y3};
			if (isfilled) {
				StdDraw.setPenColor(red,green,blue);
				StdDraw.filledPolygon(xvalues, yvalues);
			}
			else if (!isfilled) {
				StdDraw.setPenColor(red,green,blue);
				StdDraw.polygon(xvalues, yvalues);
			}
		}


		if (isfilled && shapetype.equals("rectangle")) {
			StdDraw.setPenColor(red,green,blue);
			StdDraw.filledRectangle(x,y,HalfWidth,HalfHeight);
		}
		else if (!isfilled && shapetype.equals("rectangle")) {
			StdDraw.setPenColor(red,green,blue);
			StdDraw.rectangle(x,y,HalfWidth,HalfHeight);
		}


	}
}
