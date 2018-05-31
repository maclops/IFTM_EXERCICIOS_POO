package SOLID_ISP;

public abstract class Drone extends Veiculo implements Camera {

	private boolean cameraOn;

	private boolean isCameraOn() {
		return cameraOn;
	}

	@Override
	public void ligarCamera() {
		cameraOn = true;
	}

	@Override
	public void desligarCamera() {
		cameraOn = false;
	}

}
