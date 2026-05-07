package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.GameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {

    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping("/start")
    public WeatherData start() {
        return service.startGame();
    }

    @PostMapping("/answer")
    public JudgeResult answer(@RequestBody Answer answer) {
        return service.checkAnswer(answer);
    }
}