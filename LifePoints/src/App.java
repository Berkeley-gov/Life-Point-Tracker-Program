import com.lifepoints.game.Game;
import com.lifepoints.game.Player;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Game yugiOh = new Game();
        ArrayList<Player> players = new ArrayList<Player>();
        yugiOh.menu(players);
        System.out.println("Program terminated");
    }
}
