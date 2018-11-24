package mymusicapp;

import org.jfugue.Pattern;
import org.jfugue.Player;

public class teste {

	public static void main(String[] args) {
		//String string = "X[Volume]=10200 I[10] C D E F G I[1] C D E F G @2 X[Volume]=6100 I[10] C D E F G I[1] C D E F G";
		String string = "C @200 C";
	    Player player = new Player();
	    Pattern pattern = new Pattern(string);
	    player.play(pattern);

	}

}
