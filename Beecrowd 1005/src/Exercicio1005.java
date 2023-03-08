import java.util.Scanner;

public class Exercicio1005 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, media;
		
		// entrada
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		
		// processamento
		media = (a * 3.5 + b * 7.5) / 11.0;
		
		// saida
		System.out.printf("MEDIA = %.5f\n", media);
		teclado.close();
	}
}