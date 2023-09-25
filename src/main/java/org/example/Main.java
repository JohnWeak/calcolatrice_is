package org.example;

public class Main
{
	public static void main(String[] args)
	{
		Calcolatrice calcolatrice = new Calcolatrice();
		int somma = calcolatrice.somma(1,2);
		int moltiplicazione = calcolatrice.moltiplicazione(19, 2);
		
		System.out.printf("Somma = %d\nMoltiplicazione = %d\n\n", somma, moltiplicazione);
		
	} // fine main()
	
} // fine classe Main