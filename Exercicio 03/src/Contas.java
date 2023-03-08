import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor do salário mínimo:");

		double minimumWage = scanner.nextDouble();

		System.out.println("Informe a quantidade de KW gasta por uma residência:");

		double kwConsumed = scanner.nextDouble();

		double kwValue = minimumWage / 7 / 100;

		double totalBill = kwConsumed * kwValue;

		double discountedBill = totalBill * 0.9;

		System.out.println("Valor de cada KW: " + kwValue);

		System.out.println("Valor total a ser pago:" + totalBill);

		System.out.println("Valor com desconto de 10%:" + discountedBill);

	}

}
