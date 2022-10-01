package lista4;

import java.util.Scanner;

public class Quest01 {

	public static double calculoImpostodeRenda(double salariomin,int dependentes,double salariofuncionario,double taxapaga) {
		double impostobruto=0,restituicao=0,taxaadicional=0,impostoderenda=0;
		if(salariofuncionario > 12*salariomin) {
			impostobruto = 0.20;
		} else if(salariofuncionario > 5*salariomin) {
			impostobruto = 0.08;
		} else {
			impostobruto = 0.00;
		}
		
		taxaadicional = 0.04*impostobruto;
		restituicao = 0.02*dependentes;
		
		impostoderenda = ((salariofuncionario-restituicao)*impostobruto)-taxapaga+taxaadicional;
		
		return impostoderenda;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int  dependentes=0;
		double salariomin=0,salariofuncionario=0,taxapaga=0;
		System.out.println("Informe o valor do salário mínimo;");
		salariomin = entrada.nextDouble();
		System.out.println("Informe o número de dependentes do funcionário:");
		dependentes = entrada.nextInt();
		System.out.println("Informe o valor do salário do funcionário:");
		salariofuncionario = entrada.nextDouble();
		System.out.println("Informe a taxa de imposto já paga pelo funcionário:");
		taxapaga = entrada.nextDouble();
		
		System.out.println("O imposto de renda do funcionario é:" + calculoImpostodeRenda(salariomin, dependentes, salariofuncionario, taxapaga));
		
		entrada.close();
	}

}
