package mymusicapp;

import java.util.HashMap;
import java.util.Map;
public class Tradutor {

	private int oitava_default = 5;
	private int oitava = oitava_default;
	private int volume = 1000;
	private int BPM = 120;
	private int instrumento_id = 1;
	private String string_musical;
	private static Map<Integer, String> dicionario_intrumentos =  new HashMap<Integer, String>() {{
		put(1, "PIANO");
		put(2, "GUITAR");
		put(3, "MARIMBA");
		put(4, "VIOLA");
	}};

	private static Map<Integer, String> dicionario_BPM = new HashMap<Integer, String>() {{
		put(120, "ALLEGRO");
		put(40, "GRAVE");
		put(180, "PRESTO");
	}};

	public Tradutor(String string_musical) {
		this.string_musical = string_musical;
	}

	public String traduz_musica() {

		String nova_string_musical = "";
		String nota_atual = "";
		for (char ch: this.string_musical.toCharArray()){
			switch (ch) {
			case 'a':
			case 'A': nova_string_musical += String.format(" A%d", this.oitava);
			nota_atual = String.format(" A%d", this.oitava);
			break;
			case 'b':
			case 'B': nova_string_musical += String.format(" B%d", this.oitava);
			nota_atual = String.format(" B%d", this.oitava);
			break;
			case 'c':
			case 'C': nova_string_musical += String.format(" C%d", this.oitava);
			nota_atual = String.format(" C%d", this.oitava);
			break;
			case 'd':
			case 'D': nova_string_musical += String.format(" D%d", this.oitava);
			nota_atual = String.format(" D%d", this.oitava);
			break;
			case 'e':
			case 'E': nova_string_musical += String.format(" E%d", this.oitava);
			nota_atual = String.format(" E%d", this.oitava);
			break;
			case 'f':
			case 'F': nova_string_musical += String.format(" F%d", this.oitava);
			nota_atual = String.format(" F%d", this.oitava);
			break;
			case 'g':
			case 'G': nova_string_musical += String.format(" G%d", this.oitava);
			nota_atual = String.format(" G%d", this.oitava);
			break;
			case ' ': nova_string_musical += " @2";
			break;
			case '!': this.volume *= 2;
					  nova_string_musical += String.format(" X[VOLUME]=%d", this.volume);
			break;
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': this.volume /= 2;
			nova_string_musical += String.format(" X[VOLUME]=%d", this.volume);
			break;
			case '0':
			case '2':
			case '4':
			case '6':
			case '8': this.oitava += 1;
			break;
			case '1':
			case '3':
			case '5':
			case '7':
			case '9': this.oitava -= 1;
			break;
			case '?':
			case '.': this.oitava = this.oitava_default;
			break;
			case '\n': this.instrumento_id += 1;
			nova_string_musical += String.format(" I[%s]", 
					Tradutor.dicionario_intrumentos.get(this.instrumento_id));
			break;
			case ';': this.BPM += 50;
			nova_string_musical += String.format(" T[%d]", 
					Tradutor.dicionario_BPM.get(this.BPM));

			break;
			case ',': this.BPM -= 50;
			nova_string_musical += String.format(" T[%d]", 
					Tradutor.dicionario_BPM.get(this.BPM));
			break;
			default: if("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".contains(String.valueOf(ch))) {
				nova_string_musical += nota_atual;
			}
			else {
				nova_string_musical += " @2";
				
			}
			}
		}
		return nova_string_musical;
	}
}
