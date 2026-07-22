package com.sivasakthi.backend.dto;

public class RepositoryRequest {

    private String githubUrl;

    public RepositoryRequest() {
    }

    public RepositoryRequest(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
}