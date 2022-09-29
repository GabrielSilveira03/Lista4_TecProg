package lista4;

import java.util.Scanner;

public class Quest10 {

	public static void verificarNumero(int numero) {
		int somarmstrong=0,numeroaux=numero,tamanho=0;
		float aux=0;
		String mensagem = String.valueOf(numero);
		tamanho = mensagem.length();
		for (;numeroaux>=1;) {
			aux=numeroaux%10;
			somarmstrong += Math.pow(aux, tamanho);
			numeroaux = numeroaux/10;
		}
		if(somarmstrong == numero) {
			System.out.println("O número inserido é considerado um número de Armstrong");
		} else {
			System.out.println("O número inserido não é considerado um número de Armstrong");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o número que deseja verificar se é um número de Armstrong");
		int numero = entrada.nextInt();
		
		verificarNumero(numero);
		
		entrada.close();
	}

}
