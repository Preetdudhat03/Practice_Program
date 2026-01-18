/*import java.util.*;

class Student_Avg_Marks
{
	int id,mark;
	String name;

	void Setter()
	{
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the ID of the Student = ");
		id = sc.nextInt();
		System.out.println("Enter the Name of the student = ");
		name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the Marks of the student = ");
		mark = sc.nextInt();
	}

	void Getter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Marks = "+mark);

	}
	void Grade()
	{

	}
	public static void main(String[] args) {
		
	}
}*/
// Program to display grade of a student using switch...case statement in Java
/*import java.util.Scanner; // import Scanner class for user input
public class Student_Avg_Marks {
	void Switch(int grade,String name)
	{
		switch(grade)
		{
            case 1:
                System.out.println(name + " has Honours Grade ");
                break;
            case 2:
                System.out.println(name + " has First Division Grade ");
                break;
            case 3:
                System.out.println(name + " has Second Division Grade ");
                break;
            case 4:
                System.out.println(name + " has Third Division Grade ");
                break;
            case 5:
                System.out.println(name + " has Fail Grade !!!");
                break;
            default:
                System.out.println("Invalid grade");
        }		
	}
    public static void main(String[] args) {
        int id; // variable to store student id
        String name; // variable to store student name
        double avg; // variable to store average marks
        int grade; // variable to store grade

        // create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // input student id, name and average marks
        System.out.print("Enter student id: ");
        id = sc.nextInt();
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter average marks: ");
        avg = sc.nextDouble();

        // close the scanner object
        sc.close();
        //char grade;
        // calculate grade based on average marks
        if (avg >= 80 && avg <= 100)
        {
            grade = 1;
            return grade;
        }
        else if (avg >= 60 && avg <= 79)
        {
            grade = 2;
            return grade;
        }
        else if (avg >= 50 && avg <= 59)
        {
            grade = 3;
            return grade;
        }
        else if (avg >= 40 && avg <= 49)
        {
            grade = 4;
            return grade;
        }
        else if (avg >=0 && avg <= 39)
        {
            grade = 5;
            return grade;
        }
        else 
        {
        	System.out.println("Write correct Marks(0 to 100)");
        }
        //char grade;
        // display grade using switch...case statement
        
    }
}*/
// Program to display grade of a student using switch...case statement in Java
import java.util.Scanner; // import Scanner class for user input
class Student_Avg_Marks {
    public static void main(String[] args) {
        int id; // variable to store student id
        String name = null; // variable to store student name
        double avg; // variable to store average marks
        char grade = '\0'; // variable to store grade

        // create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // input student id, name and average marks
        System.out.print("Enter student id: ");
        id = sc.nextInt();
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter average marks: ");
        avg = sc.nextDouble();

        // close the scanner object
        sc.close();

        // calculate grade based on average marks
        if (avg >= 80 & avg <=100)
            grade = 'A';
        else if (avg >= 60 & avg <=79)
            grade = 'B';
        else if (avg >= 50 & avg <=59)
            grade = 'C';
        else if (avg >= 40 & avg <=49)
            grade = 'D';
        else if(avg >= 0 & avg <=39)
            grade = 'F';

        // display grade using switch...case statement
        switch (grade) {
            case 'A':
                System.out.println(name + " has Honours Grade");
                break;
            case 'B':
                System.out.println(name + " has First Division Grade");
                break;
            case 'C':
                System.out.println(name + " has Second Division Grade");
                break;
            case 'D':
                System.out.println(name + " has Third Division Grade");
                break;
            case 'F':
                System.out.println(name + " has Fail Grade !!!");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
// Program to display grade of a student using switch...case statement in Java
/*import java.util.Scanner; // import Scanner class for user input
 class Student_Avg_Marks {
    public static void main(String[] args) {
        int id; // variable to store student id
        String name; // variable to store student name
        double avg; // variable to store average marks
        char grade; // variable to store grade

        // create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // input student id, name and average marks
        System.out.print("Enter student id: ");
        id = sc.nextInt();
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter average marks: ");
        avg = sc.nextDouble();

        // close the scanner object
        sc.close();

        // calculate grade based on average marks
        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else if (avg >= 60)
            grade = 'D';
        else
            grade = 'F';

        // display grade using switch...case statement
        switch (grade) {
            case 'A':
                System.out.println(name + " has grade A");
                break;
            case 'B':
                System.out.println(name + " has grade B");
                break;
            case 'C':
                System.out.println(name + " has grade C");
                break;
            case 'D':
                System.out.println(name + " has grade D");
                break;
            case 'F':
                System.out.println(name + " has grade F");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}*/

