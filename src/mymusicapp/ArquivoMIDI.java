package mymusicapp;

import java.io.File;
import java.io.IOException;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.midi.MidiFileManager;

public class ArquivoMIDI {
    
    private String string_musica = new String();
    
    public ArquivoMIDI()
    {
        this.string_musica = string_musica;
    }
    
    public void SalvaArquivo(String nome_escolhido) throws IOException
    {
        nome_escolhido = "Test";
        Pattern padrao = new Pattern(this.string_musica);
        Player tocador = new Player();
        MidiFileManager.savePatternToMidi(padrao, new File(nome_escolhido + ".mid"));
    
    
    }
    
    
}
