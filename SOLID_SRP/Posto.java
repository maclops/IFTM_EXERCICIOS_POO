package SOLID_SRP;

public class Posto {
	
	public void reabastecimento(Veiculo veiculo) {
		veiculo.setQuantidadeCombustivel(veiculo.getCapacidadeTanqueCombustivel());
	}

}
