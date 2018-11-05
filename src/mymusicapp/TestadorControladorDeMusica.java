package mymusicapp;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class TestadorControladorDeMusica {

	public static void main(String[] args) {

			
		Tradutor musica = new Tradutor("2ABCD4EF \n2ABCD4EF3ABMCD3EF \n3ABCD3EF");
		String musica_traduzida = musica.traduz_musica();
		System.out.println(musica_traduzida);
		ControladorDeMusica tocador = new ControladorDeMusica(musica_traduzida);
		tocador.toca_musica();
		
	}
}
