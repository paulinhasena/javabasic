import java.util.Scanner;

public class Mediaescolar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, me;
		System.out.println("digite a N1");
		n1 = teclado.nextDouble();
		System.out.println("digite a N2");
		n2 = teclado.nextDouble();
		
		me = (n1 + n2)/2;
		
		System.out.println("Sua media vale " + me);
		if (me >= 6.0) {
			System.out.println("Parabens voce foi aprovado!");
		}
		else {
			System.out.println("Oba nos vemos ano que vem!!");
		}
		
		teclado.close();
	}
}