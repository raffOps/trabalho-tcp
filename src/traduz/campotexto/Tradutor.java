package traduz.campotexto;
public class Tradutor 
{

	private static int OITAVA_DEFAULT = 5;
	private static int VOLUME_MAXIMO = 16383;
	private int oitava = 5;
	private int volume = 8191;
	private int BPM = 120;
	private int instrumento_id = 0;
	private String string_musical;
	private String string_musical_traduzida = "";
	private String caractere_atual = "";

	public Tradutor(String string_musical) 
	{
            this.string_musical = string_musical;
	}
        
         public void set_Oitava(int oitava_selecionada)
        {
            this.oitava = oitava_selecionada;
            OITAVA_DEFAULT = oitava_selecionada;
        }
        
         public void set_Volume(int volume_selecionado)
        {
            this.volume = volume_selecionado;
        }
        
        public void set_Bpm(int Bpm_selecionado)
        {
            this.BPM = Bpm_selecionado;
        }
        
        public void set_Instrumento(int instrumento_selecionado)
        {
            this.instrumento_id = instrumento_selecionado;
        }
             
	public String traduz_musica() 
	{


            this.adiciona_volume_inicial_na_string_musical();
            this.adiciona_instrumento_inicial_na_string_musical();
            this.adiciona_Bpm_inicial_na_string_musical();
		
            for (char nota: this.string_musical.toCharArray())
            {
		switch (nota) {
		case 'A':
		case 'B':
		case 'C':
		case 'D': 
		case 'E': 
		case 'F': 
		case 'G':  this.adiciona_nota("" + nota);
		           break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g': if ("ABCDEFG".contains(this.caractere_atual)) 
                            {
                                this.adiciona_nota(this.caractere_atual);
			    } 
                            else 
                            {
			        this.adiciona_pausa();
			    }
                            break;
		case '!': this.muda_instrumento(7);
                          break;
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U': this.aumenta_volume((int) (this.volume * 0.1));
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
		case '9': this.muda_instrumento(this.instrumento_id + Integer.parseInt("" + nota));
		          break;
		case '?':
		case '.': this.aumenta_oitava(1);
		          break;
		case '\n': this.muda_instrumento(14);
		           break;
		case ';': this.muda_instrumento(75);
		          break;
		case ',': this.muda_instrumento(19);
		          break;
		case ' ': this.aumenta_volume(this.volume);
		          break;
		default: 
                    if("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".contains(String.valueOf(nota))) 
                    {
			if("ABCDFEF".contains(String.valueOf(nota))) 
			{
				this.string_musical_traduzida += this.caractere_atual;
			} 
                        else 
			{
                            this.adiciona_pausa();
			}
                    }
                    else 
                    {
			this.adiciona_pausa();
                    }
			
                    }
		this.caractere_atual = "" + nota;
		
            }
            
            return this.string_musical_traduzida;
	}
	
    private void adiciona_nota(String nota) 
    {
	this.string_musical_traduzida += String.format("%s%d ", nota, this.oitava);
    }
	
    private void muda_instrumento(int novo_instrumento_id) 
    {
        this.instrumento_id = novo_instrumento_id;
        this.string_musical_traduzida += String.format( "I[%d] ", this.instrumento_id);
    }
	
    private void aumenta_volume(int quantidade_de_volume_aumentado) 
    {
	if ((this.volume + quantidade_de_volume_aumentado) <= Tradutor.VOLUME_MAXIMO) 
	{
            this.volume += quantidade_de_volume_aumentado;
	} else 
	{
            this.volume = Tradutor.VOLUME_MAXIMO;
	}
	
        this.string_musical_traduzida += String.format("X[Volume]=%d ", this.volume);
    }
	
    private void adiciona_volume_inicial_na_string_musical() 
    {
	this.string_musical_traduzida += String.format("X[Volume]=%d ", this.volume);
    }
	
    private void adiciona_instrumento_inicial_na_string_musical()
    {
        this.string_musical_traduzida += String.format( "I[%d] ", this.instrumento_id);        
    }
	
    private void adiciona_Bpm_inicial_na_string_musical()
    {
        this.string_musical_traduzida += String.format( "T[%d] ", this.BPM);
    }
	
    private void aumenta_oitava(int quantidade_de_oitava_aumentada) 
    {
	if ((this.oitava + quantidade_de_oitava_aumentada) > 9) 
	{
		this.oitava = Tradutor.OITAVA_DEFAULT;
	} else 
	{
		this.oitava += quantidade_de_oitava_aumentada;
	}
    }
	
    private void adiciona_pausa() 
    {
    	this.string_musical_traduzida += "Rq ";	
    }

}
