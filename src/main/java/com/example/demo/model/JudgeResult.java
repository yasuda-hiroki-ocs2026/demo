// src/main/java/com/example/demo/model/JudgeResult.java
package com.example.demo.model;

public class JudgeResult {

    private int hit;
    private boolean clear;

    public JudgeResult(int hit, boolean clear) {
        this.hit = hit;
        this.clear = clear;
    }

    public int getHit() {
        return hit;
    }

    public boolean isClear() {
        return clear;
    }
}