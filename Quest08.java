package lista4;

import java.util.Scanner;

public class Quest08 {

	public static char[] decodificarNumero(String codificado) {
		char vetor[] = new char[codificado.length()];
		int posicao=0, tamanho=vetor.length+2;
		char vetorsaida[] = new char[tamanho];
		codificado.getChars(0, codificado.length(), vetor, 0);
		
		vetorsaida[0] = '(';
		vetorsaida[4] = ')';
		for (int contador = 0; contador < vetor.length; contador++) {
			if(contador==0) {
				posicao++;
			}
			if(contador==3) {
				posicao++;
			}
			
			if(vetor[contador] == '#') {
				vetorsaida[posicao] = '1';
				posicao++;
			} else if(vetor[contador] == 'A' || vetor[contador] == 'B' || vetor[contador] == 'C') {
				vetorsaida[posicao] = '2';
				posicao++;
			} else if(vetor[contador] == 'D' || vetor[contador] == 'E' || vetor[contador] == 'F') {
				vetorsaida[posicao] = '3';
				posicao++;
			} else if(vetor[contador] == 'G' || vetor[contador] == 'H' || vetor[contador] == 'I') {
				vetorsaida[posicao] = '4';
				posicao++;
			} else if(vetor[contador] == 'J' || vetor[contador] == 'K' || vetor[contador] == 'L') {
				vetorsaida[posicao] = '5';
				posicao++;
			} else if(vetor[contador] == 'M' || vetor[contador] == 'N' || vetor[contador] == 'O') {
				vetorsaida[posicao] = '6';
				posicao++;
			} else if(vetor[contador] == 'P' || vetor[contador] == 'Q' || vetor[contador] == 'R' || vetor[contador] == 'S') {
				vetorsaida[posicao] = '7';
				posicao++;
			} else if(vetor[contador] == 'T' || vetor[contador] == 'U' || vetor[contador] == 'V') {
				vetorsaida[posicao] = '8';
				posicao++;
			} else if(vetor[contador] == 'W' || vetor[contador] == 'X' || vetor[contador] == 'Y' || vetor[contador] == 'Z') {
				vetorsaida[posicao] = '9';
				posicao++;
			} else if(vetor[contador] == '+') {
				vetorsaida[posicao] = '0';
				posicao++;
			}
		}
		
		return vetorsaida;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o número(com letras e números) que deseja decodificar(use as letras em caixa alta):");
		String numero = entrada.nextLine();
		
		for (int contador = 0; contador < decodificarNumero(numero).length; contador++) {
			System.out.print(decodificarNumero(numero)[contador]);
		}
		
		entrada.close();
	}

}
