package TP6;

public class Mathematique {
	public double x;
	public double n;
	
	public Mathematique(double x, double n) {
		this.n=n;
		this.x=x;
	}
	
	public static double f(double x, double n) {
			return (Math.sqrt(x)/n);

	}
}
