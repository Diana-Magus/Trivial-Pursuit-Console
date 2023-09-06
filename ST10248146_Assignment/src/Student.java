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
    static ArrayList<Student> student = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
     
    String ID, Name, EmailAddress, Course;
    int Age;
    
    public Student(String sID, String sName, String sEmailAddress, String sCourse, int iAge){
        this.ID=sID;
        this.Name=sName;
        this.EmailAddress=sEmailAddress;
        this.Course=sCourse;
        this.Age=iAge;   
    }
    
    public String getID(){
        return this.ID;
    } 
    
    public String getName(){
    return this.Name;
    }
    
    public String getEmailAddress(){
        return this.EmailAddress;
    } 
    
    public String getCourse(){
    return this.Course;
    }
    
    public int getAge(){
    return this.Age;
    }
    
    public static void displayInfo(Student item){
        System.out.println("STUDENT ID: " + item.getID());
        System.out.println("STUDENT NAME: " + item.getName());
        System.out.println("STUDENT AGE: " + item.getAge());
        System.out.println("STUDENT EMAIL: " + item.getEmailAddress());
        System.out.println("STUDENT COURSE: " + item.getCourse());
    }
    
    public static void MainMenue(){ 
        System.out.println("");
       System.out.println("STUDENT MANAGMENT APPLICATION");
       System.out.println("**************************************");
       System.out.println("Please enter (1) to view the menue or any other key to exit"); 
       
        String input = makeScanner().nextLine(); //input ti view menue or exit applcation
        
        
        SystemDecision(bCheck(input));
                
    }
    
   public static void PrintMenue(){
       System.out.println("");
       System.out.println("Please select one of the following menue items:");
       System.out.println("(1) Capture a new student.");
       System.out.println("(2) Search for a student.");
       System.out.println("(3) Delete a student.");
       System.out.println("(4) Print a student report.");
       System.out.println("(5) Exit application.");
       
       int input = makeScanner().nextInt();
       
       while(input != 5)
        {
            switch(input)
            {
                case 1:SaveStudent();
                        break;
                case 2:SearchStudent();
                        break;
                case 3:DeleteStudent();
                        break;
                case 4: StudentReport();
                        break;
               
                default:{
                    if(input!=5)
                        System.out.println("Wrong input given");
                }
            }
        }
} 
   
   public static void SaveStudent(){
   
   
    System.out.println("Enter the student id: ");
    String sID = makeScanner().nextLine();
    
    System.out.println("Enter the student name: ");
    String sName = makeScanner().nextLine();
    
    
    
    System.out.println("Enter the student age: ");
    String sAge =makeScanner().nextLine();
    int iAge = checkAge(sAge);
    
    
    System.out.println("Enter the student email: ");
    String sEmailAddress = makeScanner().nextLine();
    
    System.out.println("Enter the student course: ");
    String sCourse = makeScanner().nextLine();
    
    
    student.add(new Student(sID,sName, sEmailAddress, sCourse, iAge));
    
    MainMenue();
   }
   
   public static void SearchStudent(){
       System.out.println("Enter student id for searching:"); 
       String sInput=makeScanner().nextLine();
       boolean bCheck=false;
       
       for (Student item: student){
           if (item.getID().equals(sInput)){
               displayInfo(item) ;
               bCheck=true;
           }   
       }
       
        if(!bCheck){
        System.out.println("Student with id: " +sInput+ " was not found");
        }
        
       MainMenue();
       }   
       
   
   
   public static void DeleteStudent(){
       System.out.println("Enter student id to delete:"); 
       String sInput=makeScanner().nextLine();
       
       System.out.println("Are you sure you want to delete student "+ sInput+ " from the system? Yes (y) to delete.");
       String sConfrim = makeScanner().nextLine();
       
       if (sConfrim.equals("y")){
       for (Student item: student){
           if (item.getID().equals(sInput)){
              student.remove(item);  
               System.out.println("-----------------------------------------------");
               System.out.println("Student with student id:" + sInput+ " was deleted.");
               System.out.println("-----------------------------------------------");
               break;
           }
       }
       }
       else{
           System.out.println("patatoes");}
       
      MainMenue(); 
   }
   
   public static void StudentReport(){
       int icount=0;
       for (Student item: student){
           System.out.println("STUDENT " + icount);
           System.out.println("-----------------------------------------------");
           displayInfo(item);
           System.out.println("-----------------------------------------------");
           icount++;
       }
       MainMenue();
   }
   
   public static int checkAge(String sAge)
{
    int iAge;

 
   try {
       iAge=Integer.parseInt(sAge);
      
   }
   catch(NumberFormatException e){
       System.out.println("You have entered an incorrect student age!!!");
       System.out.println("Please re-enter the student age.");
       sAge=makeScanner().nextLine();
       return checkAge(sAge);
   }
   
   while (iAge<16){
   System.out.println("You have entered an incorrect student age!!!");
   System.out.println("Please re-enter the student age.");
   sAge=makeScanner().nextLine();
   return checkAge(sAge);
   }

    return iAge;
}
   
   public static Scanner makeScanner(){

Scanner scan = new Scanner(System.in);
return scan;

}
   
   public static boolean bCheck(String sInput){
   
   int iCheck;
   
   try {
       iCheck=Integer.parseInt(sInput);
       if (iCheck==1){
           return true;
       } else{
           return false;
       }
   }
   catch(NumberFormatException e){
       return false;
   }
   }
   
   public static void ExitStudentApplication(){
   System.exit(0);
   }
   
   public static void SystemDecision(boolean bCheck){
   if (bCheck){
     PrintMenue();  
   }
   else{
      ExitStudentApplication();
   }
   }
   
}


