import java.util.Scanner;
public class NumberAndSquare{
public static void main(String[] args){
Scanner input=new Scanner(System.in); 
int lower=input.nextInt(); 
int upper= input.nextInt(); 
for(int i=lower;i<=upper;i++) 
{ 
    System.out.print("("+i+","+(i*i)+")"+" "); 
} 
input.close();
}
}