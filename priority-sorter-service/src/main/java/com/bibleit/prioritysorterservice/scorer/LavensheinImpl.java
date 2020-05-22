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

    @Override
    public QuestionAnswer[] getScore(QuestionAnswer[] fromData, String fromUser) {
        // set split for user input
        scoredArr = new QuestionAnswer[fromData.length];
        splitFromUser = fromUser.split(" ");

        // loop throught all the data
        for (int i=0; i < fromData.length; i++){
            currentScore = 0.0;
            // get the current question as an array
            dataStingToCompare = ((QuestionAnswerImpl)fromData[i]).getQuestion();
            splitData = ((QuestionAnswerImpl)fromData[i]).getQuestion().split(" ");


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

        // compare index of fromUser to from data
        double score = distance.apply(splitFromUser[y], splitData[x]);

        if (score < 1.6){
            returnedScore += 2;
        }

        if (y == x && score <= 1){

            if (y == 0 && score < 1){
                returnedScore += 20;
            }
            returnedScore += 10;
        }
        return returnedScore;
    }
}
