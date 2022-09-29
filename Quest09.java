package lista4;

import java.util.Scanner;

public class Quest09 {

	public static void imprimirTriangulo(int altura) {
		for (int contador = 0; contador < altura; contador++) {
			for (int contador2 = 0; contador2 < (altura-contador)-1; contador2++) {
				System.out.print(" ");
			}
			for (int contador3 = 0; contador3 < (2*contador)+1; contador3++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a altura do triângulo que será exibido:");
		int altura = entrada.nextInt();
		
		imprimirTriangulo(altura);
		
		entrada.close();
	}

}
