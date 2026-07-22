package com.sivasakthi.backend.dto;

import java.util.List;

public class AIResponse {

    private List<String> bugs;

    public AIResponse() {
    }

    public AIResponse(List<String> bugs) {
        this.bugs = bugs;
    }

    public List<String> getBugs() {
        return bugs;
    }

    public void setBugs(List<String> bugs) {
        this.bugs = bugs;
    }
}