package com.bibleit.questionkeywordcomparer.model;

public class CompareData {
    private double acumilatedScore;
    private String scoredWords;


    public double getAcumilatedScore() {
        return acumilatedScore;
    }

    public void setAcumilatedScore(double acumilatedScore) {
        this.acumilatedScore = acumilatedScore;
    }

    public String getScoredWords() {
        return scoredWords;
    }

    public void setScoredWords(String scoredWords) {
        this.scoredWords = scoredWords;
    }

    @Override
    public String toString() {
        return "CompareData{" +
                "acumilatedScore=" + acumilatedScore +
                ", scoredWords='" + scoredWords + '\'' +
                '}';
    }
}
