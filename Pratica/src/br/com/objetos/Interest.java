package br.com.objetos;

// Cálculos de juros compostos com for.
public class Interest {

	public static void main(String[] args) {
		
		double amount; // quantia em depósito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes dos juros
		double rate = 0.05; // taxa de juros
		
		// exibe cabeçalhos
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		// Calcula quantidade de depósito para cada um dos dez anos
		for (int year = 1; year <= 10; ++year) {
			
			// Calcula quantidade de depósito para cada um dos dez anos
			amount = principal * Math.pow(1.0 + rate, year);
			
			// exibe o ano e a quantidade
			System.out.printf("%4d%,20,2f%n", year, amount);
		}
	}
} // fim da classe Interest
