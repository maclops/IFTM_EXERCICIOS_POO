package SOLID_OCP;

public class Passeio implements ModoDirecao {

	@Override
	public void trocaDirecao(Carro carro) {
		carro.setPotencia(400);
		carro.setAlturaSuspensao(20);		
	}
}
