import java.util.ArrayList;

public class Game {
    protected ArrayList<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getAllPlayers(){
        return players;
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = null;
        Player player2 = null;

        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
        }

        if (player1 == null) {
            throw new RuntimeException("Игрок" + playerName1 + "не зарегистрирован");
        }
        if (player2 == null) {
            throw new RuntimeException("Игрок" + playerName2 + "не зарегистрирован");
        }

        if (player1.getStrength() == player2.getStrength()) {
            return 0;
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }

        if (player1.getStrength() < player2.getStrength()) {
            return 2;
        }
        return 0;
    }
}



