/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

import java.util.ArrayList;
import static st10248141_quizgame.GameCode.random;

/**
 *
 * @author lab_services_student
 */
public class QuestionsAnswers {
   
    private String question;
    private String answer;

    public QuestionsAnswers(String question, String answer) {
        this.question = question;
        this.answer = answer;   
    }
    
     

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }
    
    
}

