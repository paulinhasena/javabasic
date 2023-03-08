import java.util.Scanner;

public class Exercicio1020 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade, dias, meses, anos;
		idade = teclado.nextInt();
		
		//processamento
		anos  = idade / 365;
		meses = (idade % 365) / 30;
		dias  = idade % 365 % 30;
		
		System.out.println(anos  + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias  + " dia(s)");
		
		teclado.close();
	}
}