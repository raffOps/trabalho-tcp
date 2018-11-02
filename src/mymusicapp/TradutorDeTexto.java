package mymusicapp;

import java.util.HashMap;
import java.util.Map;

public class TradutorDeTexto {
	String texto;
	public TradutorDeTexto(String texto) {
		this.texto = texto;
		
	}
	
	private void traduzTexto() {

		this.texto.replaceAll("a","A");
		this.texto.replaceAll("b","B");
		this.texto.replaceAll("c","C");
		this.texto.replaceAll("d","D");
		this.texto.replaceAll("e","E");
		this.texto.replaceAll("f","F");
		this.texto.replaceAll("g","G");
		
	}
}
