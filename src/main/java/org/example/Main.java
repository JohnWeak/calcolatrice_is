package org.example;

public class Main
{
	public static void main(String[] args)
	{
		Calcolatrice calcolatrice = new Calcolatrice();
		int somma = calcolatrice.somma(1,2);
		int moltiplicazione = calcolatrice.moltiplicazione(4, 7);
		int sottrazione = calcolatrice.sottrazione(3,10);
		double divisione = calcolatrice.divisione(5,2);
		
		String resultString = String.format("Somma = %d\nMoltiplicazione = %d\nSottrazione = %d\nDivisione = %.1f\n\n", somma, moltiplicazione, sottrazione, divisione);
		
		System.out.printf(resultString);
		
	} // fine main()
	
} // fine classe Main