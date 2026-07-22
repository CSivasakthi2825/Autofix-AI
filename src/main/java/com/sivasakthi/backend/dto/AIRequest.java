package com.sivasakthi.backend.dto;

public class AIRequest {

    private String sourceCode;

    public AIRequest() {
    }

    public AIRequest(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }
}