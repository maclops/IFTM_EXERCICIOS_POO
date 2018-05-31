package design_patern_strategy_relatorios;

public class RelatorioSimples extends Relatorio {

	@Override
	public void imprimeRelatorio() {

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
