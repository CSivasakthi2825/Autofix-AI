package com.sivasakthi.backend.service;

import com.sivasakthi.backend.ai.AIService;
import com.sivasakthi.backend.git.GitService;
import com.sivasakthi.backend.model.BugReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisService {

    @Autowired
    private GitService gitService;

    @Autowired
    private AIService aiService;

    public List<BugReport> analyzeRepository(String githubUrl) {

        // Step 1 : Clone Repository
        String repositoryPath = gitService.cloneRepository(githubUrl);

        // Step 2 : Analyze Repository
        return aiService.analyzeRepository(repositoryPath);

    }

}