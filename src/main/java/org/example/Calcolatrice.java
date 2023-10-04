package org.example;

public class Calcolatrice
{
	// private int a, b;
	
	// public Calcolatrice() {}
	
	/**Calcola la somma fra due numeri
	 * @param a primo addendo
	 * @param b secondo addendo
	 * @return il risultato dell'addizione
	 * */
	public int somma(int a, int b)
	{
		return a+b;
	}
	
	/**Calcola il prodotto di due numeri
	 * @param a il moltiplicando
	 * @param b il moltiplicatore
	 * @return il prodotto della moltiplicazione
	 * */
	public int moltiplicazione(int a, int b)
	{
		return a*b;
	}
	
	/**Calcola la differenza di due numeri
	 * @param a il minuendo
	 * @param b il sottraendo
	 * @return il risultato della sottrazione
	 * */
	public int sottrazione(int a, int b)
	{
		return a-b;
	}
	
	/**Calcola la divisione di due numeri sotto forma di double
	 * @param a il dividendo
	 * @param b il divisore
	 * @return il risultato della divisione; -1 se il divisore è zero*/
	public double divisione(int a, int b)
	{
		if (b != 0)
			return (double) a/b;
		else
			return -1;
	}
	
	
	public int qualcosa()
	{
		return 2;
	}
	
	
} // fine classe Calcolatrice
