package com.example.demo.controller;

import com.example.demo.service.MatchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/match")
public class MatchController {

    private final MatchService service;

    public MatchController(MatchService service) {
        this.service = service;
    }

    @PostMapping("/join")
    public String join(@RequestParam String playerId) {
        return service.join(playerId);
    }

    @GetMapping("/status")
    public String status(@RequestParam String playerId) {
        return service.getGameId(playerId);
    }
}