package com.sivasakthi.backend.dto;

import java.util.List;

public class ResponseContent {

    private List<ResponsePart> parts;

    public ResponseContent() {
    }

    public List<ResponsePart> getParts() {
        return parts;
    }

    public void setParts(List<ResponsePart> parts) {
        this.parts = parts;
    }
}