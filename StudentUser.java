import java.util.Scanner;
public class StudentUser {
public static void main(String[] args) {
Scanner input=new Scanner(System.in); 
System.out.print("Total Users: "); 
int total_user=input.nextInt(); 
System.out.print("Staff Users: "); 
int staff_user=input.nextInt(); 
int non_tech=staff_user/3; 
int student_user=total_user-(staff_user+non_tech); 
System.out.println("Student Users: "+student_user);
input.close();
}
}