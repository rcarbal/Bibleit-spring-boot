package com.bibleit.questionkeywordcomparer.model;

public class QuestionAnswer implements Comparable<QuestionAnswer> {

    private String question;
    private String answer;
    private String verse;
    private String note;
    private String keywords;
    private double score;
    private String matches;

    public QuestionAnswer() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }

    @Override
    public int compareTo(QuestionAnswer o) {
        int comparedValue = (int) (this.getScore() - o.getScore());
       return comparedValue;
    }
}
