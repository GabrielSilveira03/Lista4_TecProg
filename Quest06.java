package lista4;

import java.util.Scanner;

public class Quest06 {

	public static void tempoMaterial(int massa) {
		int tempototalseg=0,tempototalmin=0,tempototalhor=0;
		float massafinal = massa;
		for (; massafinal > 0.5;) {
			massafinal = massafinal/2;
			tempototalseg += 50;
		}
		tempototalmin = tempototalseg/60;
		tempototalseg = tempototalseg%60;
		tempototalhor = tempototalmin/60;
		tempototalmin = tempototalmin%60;
		
		System.out.println("Massa inicial = " + massa);
		System.out.println("Massa final = " + massafinal);
		System.out.println("Tempo total : " + tempototalhor + " horas, " + tempototalmin + " minutos, " + tempototalseg + " segundos");
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a massa inicial do material:");
		int massainic = entrada.nextInt();
		
		tempoMaterial(massainic);
		
		entrada.close();
	}

}
