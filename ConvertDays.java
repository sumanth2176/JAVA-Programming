import java.util.Scanner;
public class ConvertDays {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of days: ");
int num=input.nextInt(); 
int years=num/365; 
System.out.println("years: "+years); 
int weeks=(num%365)/7; 
System.out.println("weeks: "+weeks); 
int days=(num%365)%7; 
System.out.println("Days: "+days); 
input.close();
}
}