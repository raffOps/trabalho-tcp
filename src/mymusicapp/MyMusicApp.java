package mymusicapp;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class MyMusicApp
{
 public static void main(String[] args) 
 {
 
 Player player = new Player();
 Pattern pattern = new Pattern("C3 D3 E3 F3 G3 A3 B3")
    .setVoice(0) //PARA INSTRUMENTOS DE PERCUSÃO COMO BATERIA E DERIVADOS COLOQUE 9 NO setVoice.
                 // OS DEMAIS SÃO INTRUMENTOS GERAIS COMO PIANO, GUITARRA SAX E ETC.
    .setInstrument(64) // CADA NUMERO É UM INSTRUMENTO, ISSO ESTA AQUI https://www.cs.utexas.edu/ftp/novak/cs315/jfugue-chapter2.pdf
    .setTempo(120); // O TEMPO É O BPM.
 player.play(pattern);
 System.exit(0);
 }
} 
