package lista4;

import java.util.Scanner;

public class Quest02 {

	public static double precoAluguel(String dia,String estado, double preco) {
		double desconto=0,acrescimo=0;
		if(dia.equals("segunda") || dia.equals("Terça") || dia.equals("Quinta")) {
			desconto = (0.40*preco);
		} 
		if(estado.equals("nova")) {
			acrescimo = (0.15*preco);
		}
		
		preco = preco + acrescimo - desconto;
		
		return preco;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String dia = new String();
		String estado = new String();
		double preco=0;
		System.out.println("Informe qual dia da semana ocorreu o aluguel(EXEMPLO: Segunda):");
		dia = entrada.nextLine();
		System.out.println("Informe o estado da ferramenta(Comum ou Nova):");
		estado = entrada.nextLine();
		System.out.println("Informe o preço do aluguel da ferramenta:");
		preco = entrada.nextDouble();

		System.out.println("O preço final do aluguel da ferramennta foi R$" + precoAluguel(dia, estado, preco));
		
		entrada.close();
	}

}
