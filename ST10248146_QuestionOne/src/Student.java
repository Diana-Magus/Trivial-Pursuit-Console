
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lab_services_student
 */
public class Student {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    String ID, Name, EmailAddress, Course;
    int Age;

    public Student(String sID, String sName, String sEmailAddress, String sCourse, int iAge) {
        this.ID = sID;
        this.Name = sName;
        this.EmailAddress = sEmailAddress;
        this.Course = sCourse;
        this.Age = iAge;
    }

    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    public String getEmailAddress() {
        return this.EmailAddress;
    }

    public String getCourse() {
        return this.Course;
    }

    public int getAge() {
        return this.Age;
    }

    public static void displayInfo(Student item) {
        System.out.println("STUDENT ID: " + item.getID());
        System.out.println("STUDENT NAME: " + item.getName());
        System.out.println("STUDENT AGE: " + item.getAge());
        System.out.println("STUDENT EMAIL: " + item.getEmailAddress());
        System.out.println("STUDENT COURSE: " + item.getCourse());
    }

    public static void MainMenue() {
        System.out.println("");
        System.out.println("STUDENT MANAGMENT APPLICATION");
        System.out.println("**************************************");
        System.out.println("Please enter (1) to view the menue or any other key to exit");

        String input = makeScanner().nextLine(); //input ti view menue or exit applcation

        SystemDecision(bCheck(input));

    }



    
    public static void SaveStudent() {

        System.out.println("Enter the student id: ");
        String sID = makeScanner().nextLine();

        System.out.println("Enter the student name: ");
        String sName = makeScanner().nextLine();

        System.out.println("Enter the student age: ");
        String sAge = makeScanner().nextLine();
        
        int iCheck= checkAge(sAge);
        int iAge= 0;
        
        while (iCheck!=1){
        
            System.out.println("You have entered an incorrect student age!!!");
            System.out.println("Please re-enter the student age.");
            sAge = makeScanner().nextLine();
            iCheck=checkAge(sAge);
        }
        iAge = Integer. parseInt(sAge);   
        

        System.out.println("Enter the student email: ");
        String sEmailAddress = makeScanner().nextLine();

        System.out.println("Enter the student course: ");
        String sCourse = makeScanner().nextLine();

        SaveStudent( sID, sName,sEmailAddress, sCourse, iAge, students);
        Menue m = new Menue();   
        m.PrintMenue();

    }
    
    public static void SaveStudent(String sID, String sName, String sEmailAddress, String sCourse, int iAge,ArrayList<Student> ArrStudent){
        Student s = new Student( sID,  sName,  sEmailAddress, sCourse, iAge) ;
        
        ArrStudent.add(s);
        System.out.println("");
        System.out.println("Student has been sucessfully captured.");
        
    }
    
    

    public static void SearchStudent() {
        System.out.println("Enter student id for searching:");
        String sInput = makeScanner().nextLine();
        
        SearchStudent( sInput, students);
        Menue m = new Menue();   
                m.PrintMenue();
    }
    
    public static Student SearchStudent(String sID, ArrayList<Student> ArrStudent) {
        
        String sInput = sID;
     

        for (Student item : ArrStudent) {
            if (item.getID().equals(sInput)) {
                System.out.println("--------------------------------------------------------------");
                displayInfo(item);
                System.out.println("--------------------------------------------------------------");
                return item;
            }
        }

        
            System.out.println("--------------------------------------------------------------");
            System.out.println("Student with id: " + sInput + " was not found");
            System.out.println("--------------------------------------------------------------");

            Student nStudent =null;
            return nStudent;
  
    }

    public static void DeleteStudent() {
        System.out.println("Enter student id to delete:");
        String sInput = makeScanner().nextLine();

        System.out.println("Are you sure you want to delete student " + sInput + " from the system? Yes (y) to delete.");
        String sConfrim = makeScanner().nextLine();

        if (sConfrim.equals("y")) {
            DeleteStudent( sInput, students);
            Menue m = new Menue();   
            m.PrintMenue();

        } else {
            System.out.println("Deletion cancelled");
             Menue m = new Menue();   
         m.PrintMenue();
        }

    }
    
    public static boolean DeleteStudent(String sID, ArrayList<Student> ArrStudent) {
        boolean bCheck=false;
            for (Student item : ArrStudent) {
                if (item.getID().equals(sID)) {
                    ArrStudent.remove(item);
                    System.out.println("--------------------------------------------------------------");
            System.out.println("Student with id: "+ sID + " WAS deleted");
            System.out.println("--------------------------------------------------------------");
                    return bCheck=true;   
                }
            }
            
            System.out.println("--------------------------------------------------------------");
            System.out.println("Student with id: "+ sID + " was not found!");
            System.out.println("--------------------------------------------------------------");   
        
        return bCheck=false;
    }

    public static void StudentReport() {
        int icount = 1;
        for (Student item : students) {
            System.out.println("STUDENT " + icount);
            System.out.println("-----------------------------------------------");
            displayInfo(item);
            System.out.println("-----------------------------------------------");
            icount++;
        }
        Menue m = new Menue();   
        m.PrintMenue();
    }

    public static int checkAge(String sAge) {
        int iAge;
        int i =0;
        try {
            iAge = Integer.parseInt(sAge);

        } catch (NumberFormatException e) {
            
            return  i =2;
        }

        if (iAge < 16) {
            
            return i=3;
        }
        
        return i=1;
    }

    public static Scanner makeScanner() {

        Scanner scan = new Scanner(System.in);
        return scan;

    }

    public static boolean bCheck(String sInput) {

        int iCheck;

        try {
            iCheck = Integer.parseInt(sInput);
            if (iCheck == 1) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void ExitStudentApplication() {
        System.exit(0);
    }

    public static void SystemDecision(boolean bCheck) {
        if (bCheck) {
            Menue m = new Menue();   
        m.PrintMenue();
        } else {
            ExitStudentApplication();
        }
    }

}
