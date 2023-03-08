import java.util.Scanner;

public class Inss {

		public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);

	        System.out.print("Informe o valor da hora trabalhada: ");

	        double salarioHora = sc.nextDouble();

	        System.out.print("Informe a quantidade de horas trabalhadas: ");

	        double horasTrabalhadas = sc.nextDouble();

	        double salarioBruto = salarioHora * horasTrabalhadas;

	        double descontoINSS = salarioBruto * 0.15;

	        double salarioLiquido = salarioBruto - descontoINSS;

	        System.out.println("Salário bruto: R$" + salarioBruto);

	        System.out.println("Desconto do INSS: R$" + descontoINSS);

	        System.out.println("Salário líquido: R$" + salarioLiquido);

	    }

	}

