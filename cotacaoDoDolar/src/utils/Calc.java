package utils;

public class Calc {

	public static final double IOF = 6.0;

	public static double covertor(double dolar, double quantidade) {
		double valor = dolar * quantidade;
		return valor += valor * (IOF / 100);
	}

}
