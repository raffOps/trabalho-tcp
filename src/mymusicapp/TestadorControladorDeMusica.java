package mymusicapp;

public class TestadorControladorDeMusica {

	public static void main(String[] args) {

			
		Tradutor musica = new Tradutor("ABa.C\nD8KADD?B");
		String musica_traduzida = musica.traduz_musica();
		System.out.println(musica_traduzida);
		ControladorDeMusica tocador = new ControladorDeMusica(musica_traduzida);
		tocador.toca_musica();
		
	}
}
