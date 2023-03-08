import java.util.Scanner;

public class Exercicio1046 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horaI, horaF, duracao;
		
		horaI = teclado.nextInt();
		horaF = teclado.nextInt();
		
		duracao = horaF - horaI;
		if (duracao <= 0) {
			duracao = duracao + 24;
		}
		System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");	
		teclado.close();
	}
}