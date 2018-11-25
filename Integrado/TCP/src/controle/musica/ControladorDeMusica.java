package controle.musica;
import org.jfugue.Player;
import org.jfugue.Pattern;

public class ControladorDeMusica {
	
	private String string_musical;
	
	public ControladorDeMusica(String string_musical) {
			this.string_musical = string_musical;
	}
	
	public void toca_musica() {
		Player player = new Player();
		Pattern pattern = new Pattern(this.string_musical);
		player.play(pattern);
	}
}