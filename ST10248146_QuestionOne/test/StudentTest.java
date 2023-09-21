/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class StudentTest {
    
    public StudentTest() {
    }

    @Test
    public void TestSaveStudent() { //works
        boolean bSame = false;
    ArrayList<Student> studentR = new ArrayList<>();
    ArrayList<Student> studentExp = new ArrayList<>();
         
    String sID = "0311227869456";
    
    String sName = "Hannah";
    
    int iAge = 19;
    
    String sEmailAddress = "hannah@email.com";
    
    String sCourse = "BACD1";
    
    Student s = new Student(sID,  sName, sEmailAddress,sCourse, iAge);
    
    studentExp.add(s);
    
    Student.SaveStudent(sID,sName, sEmailAddress,sCourse, iAge, studentR);
    
    if (studentExp.get(0).getID().equals(studentR.get(0).getID()) && 
        studentExp.get(0).getName().equals(studentR.get(0).getName()) &&
        studentExp.get(0).getAge()==(studentR.get(0).getAge()) &&
        studentExp.get(0).getEmailAddress().equals(studentR.get(0).getEmailAddress()) &&
        studentExp.get(0).getCourse().equals(studentR.get(0).getCourse())     
        ){
        bSame = true;
        }

    assertTrue(bSame);

    }

   
    

    @Test
    public void TestSearchStudent() { //works
        boolean bSame = false;
        ArrayList<Student> studentExp = new ArrayList<>();
        studentExp.add(new Student("0311227869456","Hannah","hannah@email.com", "BACD1", 19));
        studentExp.add(new Student("02112677868719","Rhea","rhea@email.com", "BART2", 21));
        studentExp.add(new Student("04052974959372","Kera","kera@email.com", "BART1", 18));
        
        Student studentR = null;
        studentR =Student.SearchStudent("02112677868719", studentExp);
        
       if (studentExp.get(1).getID().equals(studentR.getID()) && 
        studentExp.get(1).getName().equals(studentR.getName()) &&
        studentExp.get(1).getAge()==(studentR.getAge()) &&
        studentExp.get(1).getEmailAddress().equals(studentR.getEmailAddress()) &&
        studentExp.get(1).getCourse().equals(studentR.getCourse())     
        ){
        bSame = true;
        }

    assertTrue(bSame); 
   
    }
    
    @Test
    public void TestSearchStudent_StudentNotFound() { //wroks
        boolean bSame = true;
        ArrayList<Student> studentExp = new ArrayList<>();
        studentExp.add(new Student("0311227869456","Hannah","hannah@email.com", "BACD1", 19));
        studentExp.add(new Student("02112677868719","Rhea","rhea@email.com", "BART2", 21));
        studentExp.add(new Student("04052974959372","Kera","kera@email.com", "BART1", 18));
        
        Student studentR = null;
        studentR =Student.SearchStudent("02112677868777", studentExp);
        
       if (studentR==null)
        {
        bSame = false;
        }

    assertFalse(bSame); 
   
    }

   

    @Test
    public void TestDeleteStudent() { //works
        boolean bCheck = false;
        ArrayList<Student> studentExp = new ArrayList<>();
        studentExp.add(new Student("0311227869456","Hannah","hannah@email.com", "BACD1", 19));
        studentExp.add(new Student("02112677868719","Rhea","rhea@email.com", "BART2", 21));
        studentExp.add(new Student("04052974959372","Kera","kera@email.com", "BART1", 18));
        bCheck=Student.DeleteStudent("0311227869456", studentExp);
        
        assertTrue(bCheck);
    }
    
    @Test
    public void TestDeleteStudent_StudentNotFound(){ //works
        boolean bCheck = true;
        ArrayList<Student> studentExp = new ArrayList<>();
        studentExp.add(new Student("0311227869456","Hannah","hannah@email.com", "BACD1", 19));
        studentExp.add(new Student("02112677868719","Rhea","rhea@email.com", "BART2", 21));
        studentExp.add(new Student("04052974959372","Kera","kera@email.com", "BART1", 18));
        bCheck=Student.DeleteStudent("0311227869777", studentExp);
        
        assertFalse(bCheck);
    }


    @Test
    public void TestStudentAge_StudentAgeValid() { //works
     
        int i=Student.checkAge("22");

    assertEquals(1,i);

    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalid() { //works
     
        int i=Student.checkAge("12");

    assertEquals(3,i);

    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter() { //works
     
        int i=Student.checkAge("Twenty");

    assertEquals(2,i);

    }
    
}
