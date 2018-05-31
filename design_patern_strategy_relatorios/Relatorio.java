package design_patern_strategy_relatorios;

public abstract class Relatorio {

	public void gerarRelatorio() {
		imprimeRelatorio();
	}
	
	public abstract void imprimeRelatorio();
	
}
