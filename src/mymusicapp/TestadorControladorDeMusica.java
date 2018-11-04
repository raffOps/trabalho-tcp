package mymusicapp;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class TestadorControladorDeMusica {

	public static void main(String[] args) {


		Tradutor musica = new Tradutor("2ABCD4EF \n2ABCD4EF3ABMCD3EF \n3ABCD3EF");
		Player player = new Player();
		Pattern pattern = new Pattern(musica.traduz_musica());
		player.play(pattern);
	}
}
