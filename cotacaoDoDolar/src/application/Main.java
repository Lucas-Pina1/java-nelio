package application;

import java.util.Scanner;

import utils.Calc;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("qual é o valor do dolar?");
		double dolar = sc.nextDouble();

		System.out.println("qual a quantidade de dolar será comprado?");
		double quantidade = sc.nextDouble();

		double valorConvertido = Calc.covertor(dolar, quantidade);

		System.out.printf("O valor a ser pago em reais é de: R$ %.2f%n", valorConvertido);

		sc.close();
	}
}
