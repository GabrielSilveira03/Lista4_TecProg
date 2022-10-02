package lista4;

import java.util.Scanner;

public class Quest04 {

	public static char[] converterString(String nome) {
		char vet[] = new char[nome.length()];
		nome.getChars(0, nome.length(), vet, 0);
		
		return vet;
	}
	
	public static boolean verificarLetraVogal(char letra) {
		if(letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'u') {
			return true;
		}
			
		return false;
	}
	
	public static void verificarLetraStrings(String nomes[]) {
		for (int contador = 0; contador < nomes.length; contador++) {
			char vetaux[] = converterString(nomes[contador]);
			System.out.println("Consoantes do nome " + nomes[contador] + " :");
			for (int contador2 = 0; contador2 < vetaux.length; contador2++) {
				if(verificarLetraVogal(vetaux[contador2]) == false) {
					System.out.println(" " + vetaux[contador2]);
				}
			}
			System.out.println("Vogais do nome " + nomes[contador] + " :");
			for (int contador2 = 0; contador2 < vetaux.length; contador2++) {
				if(verificarLetraVogal(vetaux[contador2]) == true) {
					System.out.println(" " + vetaux[contador2]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe quantos nomes serão inseridos:");
		int quantidade = entrada.nextInt();
		String vetnome[] = new String[quantidade];
		for (int contador = 0; contador < quantidade; contador++) {
			System.out.println("Informe o nome" + (contador+1) + " :");
			vetnome[contador] = entrada.next();
		}
		
		verificarLetraStrings(vetnome);
		
		entrada.close();
	}

}
