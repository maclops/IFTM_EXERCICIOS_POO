package design_patern_strategy_relatorios;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		relatorioMenu();
		
		Relatorio relatorio;
		int numero;
		
		do {
			numero = sc.nextInt();

			if (numero == 1) {
				relatorio = new RelatorioSimples();
				relatorio.gerarRelatorio();
			}
			if (numero == 2) {
				relatorio = new RelatorioComplexo();
				relatorio.gerarRelatorio();
			}
			if (numero == 3) {

				System.out.printf("+----------------------------------------+%n");
				System.out.printf("|           SISTEMA  ENCERRADO           |\n");
				System.out.printf("+----------------------------------------+%n");
			}
		} while (numero != 3);
		
		sc.close();
		
	}
	

	private static void relatorioMenu() {
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Que relatório você deseja?              |\n");
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|1 - Relatório Simples                   |\n");
		System.out.printf("|2 - Relatório Completo                  |\n");
		System.out.printf("|3 - Encerrar Sistema                    |\n");
		System.out.format("+----------------------------------------+%n");
	}

	private static void relatorioComplexo() {
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Banco: %33s|\n",DadosBancarios.banco);
		System.out.printf("|Endereço: %30s|\n",DadosBancarios.endereco);
		System.out.printf("|Telefone: %30s|\n",DadosBancarios.fone);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Titular: %31s|\n",DadosBancarios.titular);
		System.out.printf("|Agencia: %31s|\n",DadosBancarios.agencia);
		System.out.printf("|Conta: %33s|\n",DadosBancarios.conta);
		System.out.printf("|Saldo: %33s|\n",DadosBancarios.saldo);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|E-mail: %32s|\n",DadosBancarios.email);
		System.out.printf("|Data: %34s|\n",DadosBancarios.data);
		System.out.format("+----------------------------------------+%n");
	}

	private static void relatorioSimples() {
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Banco: %33s|\n",DadosBancarios.banco);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Titular: %31s|\n",DadosBancarios.titular);
		System.out.printf("|Saldo: %33s|\n",DadosBancarios.saldo);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Telefone: %30s|\n",DadosBancarios.fone);
		System.out.format("+----------------------------------------+%n");
	}
	
}
