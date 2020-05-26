package com.bibleit.prioritysorterservice.scorer;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import com.bibleit.prioritysorterservice.model.QuestionAnswerImpl;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.stereotype.Component;

@Component
public class LavensheinImpl implements WordComparer {

    private QuestionAnswer[] scoredArr;
    private String[] splitFromUser;
    private String[] splitData;
    private LevenshteinDistance distance = new LevenshteinDistance();
    private double currentScore = 0.0;
    private String dataStingToCompare;
    private String inputStingToCompare;
    QuestionAnswerImpl questionTemp = null;

    @Override
    public QuestionAnswer[] getScore(QuestionAnswer[] fromData, String fromUser) {
        // set split for user input
        scoredArr = new QuestionAnswer[fromData.length];
        splitFromUser = fromUser.split("\\s+");

        // loop throught all the data
        for (int i=0; i < fromData.length; i++){
            currentScore = 0.0;
            // get the current question as an array
            dataStingToCompare = ((QuestionAnswerImpl)fromData[i]).getQuestion();
            questionTemp = (QuestionAnswerImpl) fromData[i];

            if (questionTemp.getQuestion() == ""){
                continue;
            }
            splitData = questionTemp.getQuestion().split("\\s+");


            for (int x = 0; x < splitData.length; x++){

                // parsing through all the indexes of users input
                for (int y=0; y < splitFromUser.length; y++){
                    inputStingToCompare = fromUser;
                    currentScore +=  getScoreByIndex(x, y);
                    System.out.println();
                }
                System.out.println();
            }
            // add to scoredArr
            QuestionAnswerImpl question = (QuestionAnswerImpl) fromData[i];
            question.setScore(currentScore);
            scoredArr[i] = question;
            System.out.println();
        }

        return fromData;
    }

    private double getScoreByIndex(int x, int y) {
        int returnedScore = 0;

        // remove "?"
        String fromUser = splitFromUser[y].replace("?", "");
        fromUser = fromUser.replace("\"", "");
        fromUser = fromUser.replace(".", "");
        String fromData = splitData[x].replace("?", "");
        fromData = fromData.replace("\"","");
        fromData = fromData.replace(".", "");

        // check uppercase
        boolean checkUser = Character.isUpperCase(fromUser.charAt(0));
        boolean checkData = false;

        try {
           checkData = Character.isUpperCase(fromData.charAt(0));
        }catch (Exception e){
            System.out.println(e);
        }


        // compare index of fromUser to from data
        double score = distance.apply(fromUser, fromData);

        if (score < 1.6){
            if (score == 0.0){

                if (checkUser && checkData){
                    returnedScore += 15;
                }
                returnedScore += 10;
            }
            returnedScore += 2;
        }

        if (y == x && score <= 1){

            if (y == 0.0 && score < 1){
                returnedScore += 20;
            }
            returnedScore += 10;
        }
        return returnedScore;
    }
}
