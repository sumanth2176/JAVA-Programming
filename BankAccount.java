import java.util.Scanner;
class Bank_Account{ 
String name, type;
int acc_num; 
double bal;
Bank_Account(String n, int a, String t, double b){ 
name = n; 
acc_num = a; 
type = t; 
bal = b;
} 
void deposit(double d){ 
if(d > 0) 
bal = bal + d; 
else 
System.out.println("Invalid amount"); 
} 
void withdraw(double w){ 
if(w > 0 && w <= bal) 
bal = bal - w; 
else 
System.out.println("Invalid amount"); 
} 
void display(){ 
System.out.println("Name: " + name); 
System.out.println("Account Number: " + acc_num);
System.out.println("Account Type: " + type);
System.out.println("Balance: " + bal); 
} 
}


public class BankAccount{ 
public static void main(String[] args){ 
Scanner input = new Scanner(System.in);
System.out.print("Enter the name: "); 
String n = input.nextLine();
System.out.print("Enter Account number: "); 
int a = input.nextInt();
input.nextLine();  // Consume newline
System.out.print("Enter the type of account: "); 
String t = input.nextLine(); 
System.out.print("Enter the balance amount: "); 
double b = input.nextDouble();
Bank_Account bank = new Bank_Account(n, a, t, b);
while (true){
System.out.println("\nChoose an operation:");
System.out.println("1. Display Account Info");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
int choice = input.nextInt();
switch (choice){
case 1:
bank.display();
break;
case 2:
System.out.print("Enter deposit amount: ");
double depositAmount = input.nextDouble();
bank.deposit(depositAmount);
break;
case 3:
System.out.print("Enter withdrawal amount: ");
double withdrawAmount = input.nextDouble();
bank.withdraw(withdrawAmount);
break;
case 4:
System.out.println("Exiting...");
input.close();
return;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}