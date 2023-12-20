package studentDatabaseApp;
import java.util.Scanner;
import java.util.SortedSet;

public class Student{
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = null;
    private int tuitionBalance = 0;
    private String studentID;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: Prompt user to enter Student's name and year
    public Student(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student firstname: ");
        this.firstName = input.nextLine();

        System.out.println("Enter Student lastname: ");
        this.lastName = input.nextLine();

        System.out.println(" 1-Fresher\n 2-Sophomore\n 3-Junior\n 4-Senior\n Enter Student class level");
        this.gradeYear = input.nextInt();

        setStudentID();

    }
    //Generate a Student ID
    private void setStudentID() {
        id++;
        //GradeLevel + ID
        this.studentID = gradeYear + "" + id;
    }
    //Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter Course to enroll (Q to Quit)");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Your arrears is: GHC" + tuitionBalance);
    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your balance is: GHC" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        System.out.println("Enter amount you want to pay");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Payment made for " + payment);
        viewBalance();
    }
    //Show Student Status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nStudent Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: GHC" + tuitionBalance;
    }


}
