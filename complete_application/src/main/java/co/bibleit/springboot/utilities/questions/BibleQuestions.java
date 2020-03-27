package co.bibleit.springboot.utilities.questions;

public class BibleQuestions implements Questions {

    private String question;
    private String answer;
    private String verses;

    public BibleQuestions(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String getQuestion() {
        return this.question;
    }

    @Override
    public String getAnswer() {
        return this.answer;
    }

    @Override
    public String getVerses() {
        return null;
    }


}
