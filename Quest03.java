package lista4;

import java.util.Scanner;

public class Quest03 {

	public static void verificarMultiplo(int vetor[]) {
		int vetoraux1[] = new int[vetor.length];
		int vetoraux2[] = new int[vetor.length];
		int vetoraux3[] = new int[vetor.length];
		int vetoraux4[] = new int[vetor.length];
		int posicao1=0,posicao2=0,posicao3=0,posicao4=0;
		
		for (int contador = 0; contador < vetor.length; contador++) {
			if(vetor[contador] > 0) {
				if(vetor[contador]%3==0) {
					vetoraux1[posicao1] = vetor[contador];
					posicao1++;
				} else {
					vetoraux2[posicao2] = vetor[contador];
					posicao2++;
				}
			} else if(vetor[contador] < 0) {
				if(vetor[contador]%3==0) {
					vetoraux3[posicao3] = vetor[contador];
					posicao3++;
				} else {
					vetoraux4[posicao4] = vetor[contador];
					posicao4++;
				}
			}
		}
		int numposmult[] = new int[posicao1];
		int numposnaom[] = new int[posicao2];
		int numnegmult[] = new int[posicao3];
		int numnegnaom[] = new int[posicao4];
		
		System.out.println("\nNúmeros positivos múltiplos de 3");
		for (int contador = 0; contador < posicao1; contador++) {
			numposmult[contador] = vetoraux1[contador];
			System.out.print(numposmult[contador] + " ");
		}
		System.out.println("\nNúmeros positivos não múltiplos de 3");
		for (int contador = 0; contador < posicao2; contador++) {
			numposnaom[contador] = vetoraux2[contador];
			System.out.print(numposnaom[contador] + " ");
		}
		System.out.println("\nNúmeros negativos múltiplos de 3");
		for (int contador = 0; contador < posicao3; contador++) {
			numnegmult[contador] = vetoraux3[contador];
			System.out.print(numnegmult[contador] + " ");
		}
		System.out.println("\nNúmeros negativos não múltiplos de 3");
		for (int contador = 0; contador < posicao4; contador++) {
			numnegnaom[contador] = vetoraux4[contador];
			System.out.print(numnegnaom[contador] + " ");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe de que tamanho será o vetor:");
		int tamanho = entrada.nextInt();
		
		int vetor[] = new int[tamanho];
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + ":");
			vetor[contador] = entrada.nextInt();
		}
		
		verificarMultiplo(vetor);
		
		entrada.close();
	}

}
