import java.util.Scanner;

public class Exercicio1047 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horaI, minuI, horaF, minuF;
		int tempoI, tempoF, duracao, durH, durM;
		
		horaI = teclado.nextInt();
		minuI = teclado.nextInt();
		horaF = teclado.nextInt();
		minuF = teclado.nextInt();
		
		// passo 1 - estou transformando tudo para minutos
		tempoI = horaI * 60 + minuI;		
		tempoF = horaF * 60 + minuF;
		
		// passo 2 - minha duracao é o tempo final - tempo inicial
		duracao = tempoF - tempoI;
		if (duracao <= 0) {
			duracao = duracao + 24 * 60;  // ou 1440 minutos
		}
		
		// passo 3 - voltar pra hora e minuto
		durH = duracao / 60;
		durM = duracao % 60;
		
		System.out.println("O JOGO DUROU "+durH+" HORA(S) E "+durM+" MINUTO(S)");				
		teclado.close();
	}
}