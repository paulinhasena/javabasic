import java.util.Scanner;

public class Mediavelocidade {
	
    public static void main(String[] args) {

			    Scanner scan = new Scanner(System.in);

			

			    System.out.println("Informe o tempo gasto na viagem (em horas): ");

			    double tempo = scan.nextDouble();

			

			    System.out.println("Informe a velocidade média (em km/h): ");

			    double velocidade = scan.nextDouble();

			    double distancia = velocidade * tempo;

			    double litrosUtilizados = distancia / 12;

			    System.out.println("A quantidade de litros de combustível " + "utilizados na viagem foi de: " + litrosUtilizados + " litros.");

    }

	
}
