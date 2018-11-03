package mymusicapp;
import java.util.concurrent.TimeUnit;
import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;

public class ControladorDeMusica {
	
	private int volume;
	private int oitava;
	private int oitava_default;
	private int BPM;
	private String string_musical;
	private Pattern patter;
	private int instrumento_id;
	
	public ControladorDeMusica(String string_musical) {
			this.string_musical = string_musical;
			this.volume = 50;
			this.oitava_default = 2;
			this.oitava = 3;
			this.BPM = 120;	
			this.instrumento_id = 1;
	
	}
	
	public void traduz_char(char ch) {
		switch (ch) {
		case 'a':
		case 'A': this.patter = new Pattern("A");
				  break;
		case 'b':
		case 'B': this.patter = new Pattern("B");
		          break;
		case 'c':
		case 'C': this.patter = new Pattern("C");
		          break;
		case 'd':
		case 'D': this.patter = new Pattern("D");
		          break;
		case 'e':
		case 'E': this.patter = new Pattern("E");
		          break;
		case 'f':
		case 'F': this.patter = new Pattern("F");
		          break;
		case 'g':
		case 'G': this.patter = new Pattern("G");
		          break;
		case ' ': //
		          break;
		case '!': this.volume *= 2;
		          break;
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U': this.volume /= 2;
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
		           break;
		case ';': this.BPM += 50;
		          break;
		case ',': this.BPM -= 50;
		          break;
		default: // TODO consoantes e o resto				
		}
	}

	
	public void toca_musica() {
		Player player = new Player();
		for (char ch: string_musical.toCharArray()) {
			this.traduz_char(ch); 
			this.patter.setVoice(0); //PARA INSTRUMENTOS DE PERCUSÃO COMO BATERIA E DERIVADOS COLOQUE 9 NO setVoice.
			// OS DEMAIS SÃO INTRUMENTOS GERAIS COMO PIANO, GUITARRA SAX E ETC.
			this.patter.setInstrument(this.instrumento_id); // CADA NUMERO É UM INSTRUMENTO, ISSO ESTA AQUI https://www.cs.utexas.edu/ftp/novak/cs315/jfugue-chapter2.pdf
			this.patter.setTempo(this.BPM); // O TEMPO É O BPM.
			player.play(this.patter);
		}
	}
}
