import java.util.Scanner;

public class Testeleitura {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	int valor1;
    	double valor2;
    	
    	System.out.println("Digite um Valor");
    	valor1 = teclado.nextInt();
    	System.out.println("Voce digitou o valor "+valor1);
    	
    	System.out.println("Digite um Valor");
    	valor2 = teclado.nextDouble();
    	System.out.println("Voce digitou o valor "+valor2);
    	teclado.close();
    }
}