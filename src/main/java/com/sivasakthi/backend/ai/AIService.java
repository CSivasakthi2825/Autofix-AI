package com.sivasakthi.backend.ai;

import com.sivasakthi.backend.config.GeminiConfig;
import com.sivasakthi.backend.dto.GeminiResponse;
import com.sivasakthi.backend.model.BugReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class AIService {

    @Autowired
    private RestClient restClient;

    @Autowired
    private GeminiConfig geminiConfig;

    public List<BugReport> analyzeRepository(String repositoryPath) {

        List<BugReport> reports = new ArrayList<>();

        // Step 1 : Read all Java files

        // Step 2 : Send each file to Gemini

        // Step 3 : Parse response

        // Step 4 : Create BugReport

        return reports;

    }

    private GeminiResponse callGemini(String prompt){

        return null;

    }

}