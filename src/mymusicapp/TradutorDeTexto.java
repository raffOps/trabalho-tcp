package mymusicapp;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class TradutorDeTexto {
	String texto;
	public TradutorDeTexto(String texto) {
		this.texto = texto;
	}
	
	private void traduzTexto() {
		  Map<String, String> map = new HashMap<String, String>();
		  map.put("key1", "value1");
		  map.put("key2", "value2");
		   map.put("key3", "value3");

		
	}
}
