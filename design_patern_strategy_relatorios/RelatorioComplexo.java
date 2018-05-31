package design_patern_strategy_relatorios;

public class RelatorioComplexo extends Relatorio {

	@Override
	public void imprimeRelatorio() {

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

}
