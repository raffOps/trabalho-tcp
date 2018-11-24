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
/*	private static Map<Integer, String> dicionario_intrumentos =  new HashMap<Integer, String>() {{
		put(1, "PIANO");
		put(2, "GUITAR");
		put(3, "MARIMBA");
		put(4, "VIOLA");
	}};

	private static Map<Integer, String> dicionario_BPM = new HashMap<Integer, String>() {{
		put(120, "ALLEGRO");
		put(40, "GRAVE");
		put(180, "PRESTO");
	}};*/

	public Tradutor(String string_musical) {
		this.string_musical = string_musical;
	}

	public String traduz_musica() {

		String nova_string_musical = "";
		String nota_atual = "";
		for (char ch: this.string_musical.toCharArray()){
			switch (ch) {
			case 'A': nova_string_musical += String.format(" A%d", this.oitava);
			nota_atual = String.format(" A%d", this.oitava);
			break;
			case 'B': nova_string_musical += String.format(" B%d", this.oitava);
			nota_atual = String.format(" B%d", this.oitava);
			break;
			case 'C': nova_string_musical += String.format(" C%d", this.oitava);
			nota_atual = String.format(" C%d", this.oitava);
			break;
			case 'D': nova_string_musical += String.format(" D%d", this.oitava);
			nota_atual = String.format(" D%d", this.oitava);
			break;
			case 'E': nova_string_musical += String.format(" E%d", this.oitava);
			nota_atual = String.format(" E%d", this.oitava);
			break;
			case 'F': nova_string_musical += String.format(" F%d", this.oitava);
			nota_atual = String.format(" F%d", this.oitava);
			break;
			case 'G': nova_string_musical += String.format(" G%d", this.oitava);
			nota_atual = String.format(" G%d", this.oitava);
			break;
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g': nova_string_musical += nota_atual;
					  break;
			case '!': this.instrumento_id = 7;
			          nova_string_musical += String.format( "I[%d]", this.instrumento_id);
					  break;
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': this.volume *= 1.1;
					  nova_string_musical += String.format("X[Volume]=%d", this.volume);
					  break;
			
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':   
				    String s = "" + ch;
					this.instrumento_id += Integer.parseInt(s);
					nova_string_musical += String.format(" I[%d]", this.instrumento_id);
					break;
			case '?':
			case '.': if (this.oitava == 8) {
							this.oitava = this.oitava_default;
					  } else {
						  this.oitava += 1;
					  }
			          break;
			case '\n': this.instrumento_id = 15;
			           nova_string_musical += String.format( "I[%d]", this.instrumento_id);
			           break;
			case ';': this.instrumento_id = 76;
			          nova_string_musical += String.format( "I[%d]", this.instrumento_id);
			          break;
			          
			case ',': this.instrumento_id = 20;
	               	  nova_string_musical += String.format( "I[%d]", this.instrumento_id);
	               	
			default: if("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".contains(String.valueOf(ch))) {
				     	if("ABCDFEF".contains(String.valueOf(ch))) {
				                nova_string_musical += nota_atual;
				     	} else {
				     		nova_string_musical += " @200";	
			              }
				     }
			         else {
			        	 nova_string_musical += " @200";
			         }
			}
		}
	
		return nova_string_musical;
	}
}
