import java.util.Scanner;

public class Exercicio1017 {
	
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tempo = leitor.nextInt();
        int velocidade = leitor.nextInt();
        double kilometros = tempo * velocidade;
        double media = kilometros / 12;
        System.out.println(String.format("%.3f", media)); 
    }
	
}
