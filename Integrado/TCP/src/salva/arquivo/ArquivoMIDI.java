/*
    EXECUTE NO MODO ADMINISTRADOR CASO DE ERRO NA HORA DE EXECUÇÃO!!!!
*/

package salva.arquivo;

import java.io.File;
import java.io.IOException;
import org.jfugue.Pattern;
import org.jfugue.Player;

public class ArquivoMIDI {
    
    private String string_musica = new String();
    
    public ArquivoMIDI(String texto_para_salvar)
    {
        this.string_musica = texto_para_salvar;
    }
    // COLOCAR A VARIAVEL Q GUARDA O TEXTO DA INTERFACE E POR NO "nome_do_arquivo"
    public void SalvaArquivo(String nome_do_arquivo) throws IOException 
    {   
        File arquivo = new File(nome_do_arquivo + ".mid");
        arquivo.setWritable(true);
        Pattern padrao = new Pattern(this.string_musica);
        Player tocador = new Player();
        tocador.saveMidi(padrao, arquivo);
    
    }
    
    
}
