
public abstract class ControladorDeInstrumento {
	
	private int BPM = 0;
	private int volume = 0;
	private int instrumento_id;
	
	abstract void toca_som(String letra);
	
	
	void aumenta_volume(int valor) {
		this.volume += valor;
	}
	
	void diminiu_volume(int valor) {
		this.volume -= valor;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getBPM() {
		return BPM;
	}

	public void setBPM(int bPM) {
		BPM = bPM;
	}

	public int getInstrumento_id() {
		return instrumento_id;
	}

	public void setInstrumento_id(int instrumento_id) {
		this.instrumento_id = instrumento_id;
	}
}
