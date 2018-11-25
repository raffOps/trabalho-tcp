package mymusicapp;

//NÃO ESQUEÇA DE ADICIONAR O SEU PACKAGE


/*LEIA ME*/
/*
  VOCE PRECISA COLOCAR UM DIRETORIO COM ARQUIVO DE TEXTO NA VARIAVEL "tex"
  NESSE CASO ESTA SELECIONADO UM ARQUIVO CHAMADO "test2.txt", O PROGRAMA 
  LE ESSE TEXTO E EXECUTA A MUSICA QUE ESTA NELE CONFORME AS ESPECIFICAÇÕES
  DA BIBLIOTECA JFUGUE.
*/



import org.jfugue.Pattern;
import org.jfugue.Player;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ComLeituraDeTXTexemplo
{
 public static void main(String[] args) throws FileNotFoundException, IOException
 {
    Player player = new Player();
    String tex = new String();

    tex = LerCampoDeTexto("C:\\Users\\beret\\Documents\\NetBeansProjects\\MyMusicApp\\src\\mymusicapp\\test2.txt");

    if("".equals(tex))
    {
        System.out.println("Texto Vazio!");
        System.exit(1);
    }
    else
    {   Pattern exce = new Pattern();
        exce = ControladorDeInstrumentos(tex,0,1,120);
        player.play(exce);
        System.exit(0);
    }
 
}
 
 private static String LerCampoDeTexto(String localarquivo) throws FileNotFoundException, IOException
 {
    String conteudo = new String();
    FileReader arq = new FileReader(localarquivo);
    BufferedReader lerArq = new BufferedReader(arq);
    String linha=new String();
    linha = lerArq.readLine();
    while(linha!=null)
    {
        conteudo += linha;
        linha = lerArq.readLine();
    }            
    arq.close();
    return conteudo;
}

/*private static Pattern ControladorDeInstrumentos(String texto, int voz, int instrumento, int tempo){

    Pattern pattern = new Pattern(texto)
           .setVoice(voz)                 //PARA INSTRUMENTOS DE PERCUSÃO COMO BATERIA E DERIVADOS COLOQUE 9 NO setVoice.
                                        // OS DEMAIS SÃO INTRUMENTOS GERAIS COMO PIANO, GUITARRA SAX E ETC.
           .setInstrument(instrumento)            // CADA NUMERO É UM INSTRUMENTO, LISTA DE INSTRUMENTOS https://www.cs.utexas.edu/ftp/novak/cs315/jfugue-chapter2.pdf
           .setTempo(tempo);              // O TEMPO É O BPM.
    
    return pattern;*/
}
 
}
