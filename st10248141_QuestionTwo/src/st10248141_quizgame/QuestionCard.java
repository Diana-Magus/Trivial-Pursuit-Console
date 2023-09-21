/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

/**
 *
 * @author lab_services_student
 */
public class QuestionCard extends Card{
    
QuestionsAnswers QA;    
    
  
       
    public QuestionCard(GameCode.WedgeColor category, QuestionsAnswers qa) { //each question card must have a category and QA pair
    super(category);
     this.QA=qa;
}
        
    

}
