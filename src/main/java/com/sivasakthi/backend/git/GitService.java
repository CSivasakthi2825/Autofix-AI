package com.sivasakthi.backend.git;

import org.eclipse.jgit.api.Git;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class GitService {

    public String cloneRepository(String githubUrl) {

        try {

            String projectName = githubUrl.substring(githubUrl.lastIndexOf("/") + 1);

            if(projectName.endsWith(".git")){
                projectName = projectName.replace(".git","");
            }

            String localPath = "D:/Project/cloned-repositories/" + projectName;

            File directory = new File(localPath);

            if(directory.exists()){
                return "Repository already exists at : " + localPath;
            }

            Git.cloneRepository()
                    .setURI(githubUrl)
                    .setDirectory(directory)
                    .call();

            return "Repository cloned successfully at : " + localPath;

        } catch (Exception e) {

            return "Clone Failed : " + e.getMessage();

        }

    }

}