import java.util.Scanner; 
public class PerfectSquaresInRange { 
public static void main(String[] args) { 
Scanner input=new Scanner(System.in); 
System.out.print("Enter Lower Range :");
int lower=input.nextInt(); 
System.out.print("Enter Upper Range:");
int upper=input.nextInt(); 
int i=0,x=1; 
while(i<upper) { 
int sum=0; 
int y=x*x; 
int t=y; 
while(y!=0) { 
int rem=y%10;
sum=sum+rem;
y=y/10;
} 
if(sum<10) { 
System.out.print(t+" "); 
} 
i=x*x; 
x++; 
} 
} 
}