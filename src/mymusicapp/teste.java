package mymusicapp;


import org.jfugue.Pattern;
import org.jfugue.Player;

public class teste {

	public static void main(String[] args) {
		String string = "X[Volume]=6900000 A B C X[Volume]=4300000 A B C";
		Player player = new Player();
	    Pattern pattern = new Pattern(string);
	    player.play(pattern);

	}

}
