package Exercicios;

public class CurrencyConverter {
    public static final double IOF = 0.06;
	
	public static  double converterReal(double quant,double price) {
		return quant * price - IOF;
	}
}
