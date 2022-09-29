package lista4;

import java.util.Scanner;

public class Quest05 {

	public static float mediaElementosVetor(int vetor[]) {
		float media=somaElementosVetor(vetor)/vetor.length;
		
		return media;
	}
	
	public static int produtoElementosVetor(int vetor[]) {
		int produto=1;
		for (int contador = 0; contador < vetor.length; contador++) {
			produto = produto * vetor[contador];
		}
		
		return produto;
	}
	
	public static int somaElementosVetor(int vetor[]) {
		int soma=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			soma += vetor[contador];
		}
		
		return soma;
	}
	
	public static void operacoesVetores(int vetor1[],int vetor2[],int vetor3[]) {
		System.out.println("Soma, produto e média dos elementos do vetor 1: ");
		System.out.println("Soma: " + somaElementosVetor(vetor1));
		System.out.println("Produto: " + produtoElementosVetor(vetor1));
		System.out.println("Média: " + mediaElementosVetor(vetor1));
		
		System.out.println("Soma, produto e média dos elementos do vetor 2: ");
		System.out.println("Soma: " + somaElementosVetor(vetor2));
		System.out.println("Produto: " + produtoElementosVetor(vetor2));
		System.out.println("Média: " + mediaElementosVetor(vetor2));
		
		System.out.println("Soma, produto e média dos elementos do vetor 3: ");
		System.out.println("Soma: " + somaElementosVetor(vetor3));
		System.out.println("Produto: " + produtoElementosVetor(vetor3));
		System.out.println("Média: " + mediaElementosVetor(vetor3));
		
		int vetorsomas[] = {somaElementosVetor(vetor1),somaElementosVetor(vetor2),somaElementosVetor(vetor3)};
		int vetorprodutos[] = {produtoElementosVetor(vetor1),produtoElementosVetor(vetor2),produtoElementosVetor(vetor3)};
		int vetormedia[] = {(int) mediaElementosVetor(vetor1),(int) mediaElementosVetor(vetor2),(int) mediaElementosVetor(vetor3)};
	
		
		System.out.println("Soma geral das somas dos vetores 1,2 e 3:" + somaElementosVetor(vetorsomas));
		System.out.println("Produto geral dos produtos dos vetores 1,2 e 3:" + produtoElementosVetor(vetorprodutos));
		System.out.println("Média geral das médias dos vetores 1,2 e 3:" + mediaElementosVetor(vetormedia));
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tamanho do vetor 1: ");
		int tamanho1 = entrada.nextInt();
		System.out.println("Informe o tamanho do vetor 2: ");
		int tamanho2 = entrada.nextInt();
		System.out.println("Informe o tamanho do vetor 3: ");
		int tamanho3 = entrada.nextInt();
		
		int vetor1[] = new int[tamanho1];
		int vetor2[] = new int[tamanho2];
		int vetor3[] = new int[tamanho3];
		
		for (int contador = 0; contador < tamanho1; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + " do vetor 1:");
			vetor1[contador] = entrada.nextInt();
		}
		for (int contador = 0; contador < tamanho2; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + " do vetor 2:");
			vetor2[contador] = entrada.nextInt();
		}
		for (int contador = 0; contador < tamanho3; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + " do vetor 3:");
			vetor3[contador] = entrada.nextInt();
		}
		
		operacoesVetores(vetor1, vetor2, vetor3);
		
		entrada.close();
	}

}
