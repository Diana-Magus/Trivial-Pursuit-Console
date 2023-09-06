/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

import java.util.ArrayList;

/**
 *
 * @author lab_services_student
 */
public class GenerateQuestionPair {
    
    ArrayList<QuestionsAnswers> ArtAndLiteratureQnA;
    ArrayList<QuestionsAnswers> GeographyQnA;
    ArrayList<QuestionsAnswers> EntertainmentQnA;
    ArrayList<QuestionsAnswers> SportAndLeisureQnA;
    ArrayList<QuestionsAnswers> HistoryQnA;
    ArrayList<QuestionsAnswers> ScienceAndNatureQnA;
    
    GenerateQuestionPair(){
        ArtAndLiteratureQnA = new ArrayList<>(); 
        GeographyQnA = new ArrayList<>();
        EntertainmentQnA = new ArrayList<>();
        SportAndLeisureQnA = new ArrayList<>();
        HistoryQnA = new ArrayList<>();
        ScienceAndNatureQnA = new ArrayList<>();
        
        
        ArtAndLiteratureQnA.add(new QuestionsAnswers("Art Q1", "Art A1"));
        ArtAndLiteratureQnA.add(new QuestionsAnswers("Art Q2", "Art A2"));
        
        GeographyQnA.add(new QuestionsAnswers("Geography Q1", "Geography A1"));
        GeographyQnA.add(new QuestionsAnswers("Geography Q2", "Geography A2"));
        
        EntertainmentQnA.add(new QuestionsAnswers("Entertainment Q1", "Entertainment A1"));
        EntertainmentQnA.add(new QuestionsAnswers("Entertainment Q2", "Entertainment A2"));
        
        SportAndLeisureQnA.add(new QuestionsAnswers("Sport Q1", "Sport A1"));
        SportAndLeisureQnA.add(new QuestionsAnswers("Sport Q2", "Sport A2"));
        
        HistoryQnA.add(new QuestionsAnswers("History Q1", "History A1"));
        HistoryQnA.add(new QuestionsAnswers("History Q2", "History A2"));
        
        ScienceAndNatureQnA.add(new QuestionsAnswers("Science Q1", "Science A1"));
        ScienceAndNatureQnA.add(new QuestionsAnswers("Science Q2", "Science A2"));
    }
    
    public QuestionsAnswers getQAPair(GameCode.WedgeColor wedgecolor){  //select array list based of inputted wedge color

        int index;
    QuestionsAnswers QA;

    ArrayList<QuestionsAnswers> selectedQnA;

    switch (wedgecolor) {
        case Purple:
            selectedQnA = ArtAndLiteratureQnA;
            break;
        case Blue:
            selectedQnA = GeographyQnA;
            break;
        case Pink:
            selectedQnA = EntertainmentQnA;
            break;
        case Orange:
            selectedQnA = SportAndLeisureQnA;
            break;
        case Yellow:
            selectedQnA = HistoryQnA;
            break;
        default:
            selectedQnA = ScienceAndNatureQnA;
            break;
    }

    index = randomIndex(selectedQnA);
    QA = selectedQnA.get(index);
    return QA;
    }
    
    public int randomIndex( ArrayList<QuestionsAnswers> QnA){ //generate randomIndex based of length of selected array list
        int randomIndex=GameCode.random().nextInt(QnA.size());
        return randomIndex;
    }
}
