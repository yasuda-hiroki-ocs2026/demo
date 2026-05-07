package com.example.demo.game;

import com.example.demo.model.Player;
import java.util.*;

public class GameEngine {

    private List<Player> players = new ArrayList<>();
    private int turn = 0;

    public GameEngine(String p1, String p2) {
        players.add(new Player(p1));
        players.add(new Player(p2));
    }

    public Player getCurrentPlayer() {
        return players.get(turn % players.size());
    }

    public void nextTurn() {
        turn++;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
