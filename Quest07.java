package lista4;

import java.util.Scanner;

public class Quest07 {


	public static String reverterString(String mensagem) {
		char vetoraux[] = new char[mensagem.length()];
		char vetor[] = new char[vetoraux.length];
		mensagem.getChars(0, mensagem.length(), vetoraux, 0);
		for (int contador = 0; contador < vetor.length; contador++) {
			vetor[contador] = vetoraux[(vetor.length-1)-contador];
		}
		String invertido = new String(vetor);
		
		return invertido;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a String que deseja reveter:");
		String mensagem = entrada.nextLine();
		
		System.out.println(reverterString(mensagem));
		
		entrada.close();
	}

}
