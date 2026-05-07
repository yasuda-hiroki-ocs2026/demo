package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MatchService {

    private Queue<String> waiting = new LinkedList<>();
    private Map<String, String> playerGame = new HashMap<>();

    public synchronized String join(String playerId) {
        if (!waiting.isEmpty()) {
            String opponent = waiting.poll();
            String gameId = UUID.randomUUID().toString();

            playerGame.put(playerId, gameId);
            playerGame.put(opponent, gameId);

            return gameId;
        } else {
            waiting.add(playerId);
            return "WAITING";
        }
    }

    public String getGameId(String playerId) {
        return playerGame.get(playerId);
    }
}