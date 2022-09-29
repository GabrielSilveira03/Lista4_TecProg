package lista4;

import java.util.Scanner;

public class Quest11 {

	public static int[][] matrizMatricula(int[][] matricula) {
		int matfinalmatricula[][] = new int[2][3];
		for (int linhafinal=0,coluna=0; linhafinal < 2; linhafinal++,coluna++) {
			for (int colunafinal=0,linha=2; colunafinal < 3; colunafinal++,linha--) {
				matfinalmatricula[linhafinal][colunafinal] = matricula[linha][coluna];
			}
		}
		
		return matfinalmatricula;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matrizmatricula[][] = new int[3][2];
		int contador=1;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.println("Informe o dígito " + (contador) +  " da matrícula que servirá de base para a criação da matriz");
				matrizmatricula[linha][coluna] = entrada.nextInt();
				contador++;
			}
		}
		
		for (int linha = 0; linha < 2; linha++) {
			System.out.print("[");
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matrizMatricula(matrizmatricula)[linha][coluna] + " ");
			}
			System.out.println("]");
		}
		
		entrada.close();
	}

}
