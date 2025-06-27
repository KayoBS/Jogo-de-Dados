package entities;

import utils;
import entities.PlayersArray;
import java.util.Scanner;

public class Event
{
    //ainda falta mudar coisas;
    public static ArrayList<Player> insertPlayers( Player player1, Player player2, ArrayList<Player> playerList )
    {
        player1.setInitialValues();
        player2.setInitialValues();

        playerList.add(player1);
        playerList.add(player2);

        return playerList;
    }

    public static void insertBets();
    public static void rollDice();
    public static void showDicesValues();
    public static void showWinners();
    public static void showRanking();
    public static void saveRanking();

}
