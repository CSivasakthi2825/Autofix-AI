package com.sivasakthi.backend.controller;

import com.sivasakthi.backend.dto.RepositoryRequest;
import com.sivasakthi.backend.git.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/git")
@CrossOrigin(origins = "*")
public class GitController {

    @Autowired
    private GitService gitService;

    @PostMapping("/clone")
    public String cloneRepository(@RequestBody RepositoryRequest request) {

        return gitService.cloneRepository(request.getGithubUrl());

    }

}
