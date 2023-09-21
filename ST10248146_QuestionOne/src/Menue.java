
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Menue {

    public void PrintMenue() {
        System.out.println("");
        System.out.println("Please select one of the following menue items:");
        System.out.println("(1) Capture a new student.");
        System.out.println("(2) Search for a student.");
        System.out.println("(3) Delete a student.");
        System.out.println("(4) Print a student report.");
        System.out.println("(5) Exit application.");

        int input = Student.makeScanner().nextInt();

        while (input != 5) {
            switch (input) {
                case 1:
                    Student.SaveStudent();
                    break;
                case 2:
                    Student.SearchStudent();
                    break;
                case 3:
                    Student.DeleteStudent();
                    break;
                case 4:
                    Student.StudentReport();
                    break;

                default: {
                    if (input != 5) {
                        System.out.println("Wrong input given");
                    }
                }
            }
        }
    }
}
