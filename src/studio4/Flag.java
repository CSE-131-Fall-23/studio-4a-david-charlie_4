package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setPenColor(255,109,182);
	StdDraw.filledRectangle(10, 10, 10, 10);
	StdDraw.setPenColor(0,243,234);
	double[] array1=new double[3];
	double[] array2=new double[3];
	array1[0]	= 0.2;
    array1[1] = 0.5;
    array1[2] = 0.2;
    array2[0]= 0.8;
    array2[1]=0.6;
    array2[2]=0.3;
	StdDraw.filledPolygon(array1,array2);
	}
}