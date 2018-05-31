package SOLID_OCP;

public class Esporte implements ModoDirecao {

	@Override
	public void trocaDirecao(Carro carro) {
		carro.setPotencia(500);
		carro.setAlturaSuspensao(10);		
	}
}
