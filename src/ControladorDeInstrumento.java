
public abstract class ControladorDeInstrumento {
	
	private int oitava;
	
	abstract void toca_som(String letra);
	
	

	public void aumentaOitava() {
		this.oitava += 1;
	}
	
	public void diminuiOitava() {
		this.oitava -= 1;
	}

	public int getOitava() {
		return oitava;
	}

	public void setOitava(int oitava) {
		this.oitava = oitava;
	}
}
