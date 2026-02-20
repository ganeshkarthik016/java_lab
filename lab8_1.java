
import java.io.IOException;
import java.util.Scanner;

class MyException extends Exception {
    MyException() {
        super("InvalidMarksException");
    }
}

class student throws IOException
{
    String rollno;
    String name;
    int[] marks;
    double avarage = 0;
    int count = 0;
    int maxi = 0;
    int mini = 100;
    student() {
    }    student(String rollno, String name, int[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    void Avarage() {
        avarage = 0;
        count = 0;
        maxi = 0;
        mini = 100;


        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 0 && marks[i] <= 100) {
                avarage += marks[i];
                count++;
                if (maxi < marks[i]) maxi = marks[i];
                if (mini > marks[i]) mini = marks[i];
            }
        }
        if (count > 0) {
            avarage = avarage / count;
        }
    }

    void display() {
        System.out.println("Student rollno : " + rollno);
        System.out.println("Student name : " + name);

        System.out.println("Marks : ");
        if (marks != null) {
            for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i] + " ");
            }
        }
        System.out.println("Avarage : " + avarage);
        if (count > 0) {
            System.out.println("max : " + maxi);
            System.out.println("min : " + mini);
        } else {
            System.out.println("No valid marks to compute max/min.");
        }
        System.out.println("Result processing completed.");
    }

    void input_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        this.name = sc.nextLine();
        System.out.print("Roll no : ");
        this.rollno = sc.nextLine();
        System.out.print("Number of subjects : ");
        int len = sc.nextInt();
        this.marks = new int[len];
        System.out.println("Enter marks :");

        for (int i = 0; i < len; i++) {
            int x = sc.nextInt();
            if (x <= 100 && x >= 0) {
                this.marks[i] = x;
            } else {
                try {
                    
                  
                  
                   throw new IOException();

                } catch (MyException e) {
                    System.out.println ( e. getMessage () + " Marks should be between 0 and 100! ");}
                    catch(IOException e){
                        System.out.println(e.getMessage()+"GOT it");
                    }
                catch(Exception e){
                        System.out.println(e.getMessage()+"GET out");
                    }
                }}
              }
              
            }
            


public class lab8_1 {
    public static void main(String args[]){
      student st = new student();
      st.input_data();
     st.Avarage();
      st.display();
       
    }
}
