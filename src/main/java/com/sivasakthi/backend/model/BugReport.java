package com.sivasakthi.backend.model;

public class BugReport {

    private String fileName;
    private String severity;
    private String issue;
    private String explanation;
    private String fixedCode;

    public BugReport() {
    }

    public BugReport(String fileName, String severity, String issue, String explanation, String fixedCode) {
        this.fileName = fileName;
        this.severity = severity;
        this.issue = issue;
        this.explanation = explanation;
        this.fixedCode = fixedCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getFixedCode() {
        return fixedCode;
    }

    public void setFixedCode(String fixedCode) {
        this.fixedCode = fixedCode;
    }
}