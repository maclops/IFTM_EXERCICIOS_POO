package SOLID_OCP;

public class ManipuladorDeEventos {

	private Carro carro;
	
	public ManipuladorDeEventos(final Carro carro) {
		this.carro = carro;
	}
	
	public void mudarModoDirecao(final ModoDirecao modoDirecao) {
		modoDirecao.trocaDirecao(carro);
	}
	
}
