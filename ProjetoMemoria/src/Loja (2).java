
public class Loja {
	public static void main(String[] args) {
		
		System.out.println("----- ANTES ---------------------------");
		Produto p1; // aqui eu apenas tenho uma refer�ncia para uma �rea de mem�ria
		
		p1 = new Produto(1, "Computador", 2000);  // s� terei o objeto real (ocupando um espa�o) no momento do NEW
		System.out.println("p1 = "+p1.exibir());
		
		// quando declaro desta maneira, o que q acontece?
		Produto p2 = p1;
		// na verdade, p2 aponta para a mesma �rea de mem�ria de p1 (n�o s�o 2 objetos diferentes!!!)
		
		System.out.println("p2 = "+p2.exibir());
		
		
		System.out.println("----- DEPOIS ---------------------------");
		p2.setPreco(1800); 
		// se eu altero via p2 um atributo, 
		//eu estou alterando na verdade o objeto apontado tamb�m por p1 (j� que � o mesmo objeto)
		
		System.out.println("p1 = "+p1.exibir());
		System.out.println("p2 = "+p2.exibir());
		
		
		// agora vamos falar de STRINGS e sua compara��o
		/*
		 *  String s1 = "Oi quer tc?";
		 *  String s2 = "Oi quer tc?";
		 *  
		 *  aqui a m�quina virtual Java n�o cria 2 strings diferentes (ou 2 espa�os na mem�ria)
		 *  ela verifica que a 2a string � igual a 1a e portanto faz com que a 2a refer�ncia aponte
		 *  para a mesma �rea de mem�ria da 1a.. equivale a String s2 = s1
		 * 
		 */
		
		// aqui agora eu estou obrigando a maquina virtual a criar espa�os distintos
		String s1 = new String("Oi, quer tc?");
		String s2 = new String("Oi, quer tc?"); 
		
		
		// se eu comparo s2 e s1 com == eu quero ver se ele apontam para a mesma �rea de mem�ria
		if (s1 == s2) {
			System.out.println("Apontam para o mesmo objeto");
		}
		else {
			System.out.println("Apontam para objetos diferents");
		}
		
		// agora se eu quero mesmo comparar conte�dos, eu preciso usar o EQUALS
		if (s1.equals(s2)) {
			System.out.println("Mesmo conteudo");
		}
		else {
			System.out.println("Conteudos distintos");
		}
		
	}
}
