import java.util.Scanner;
class Bank {
public double getRateOfInterest() {
return 0.0; 
}
}
class SBI extends Bank {
@Override
public double getRateOfInterest() {
return 8.4;
}
}
class ICICI extends Bank {
@Override
public double getRateOfInterest() {
return 7.3;
}
}
class AXIS extends Bank {
@Override
public double getRateOfInterest() {
return 9.7;
}
}
class BankAccount {
private String accountHolderName;
private String accountNumber;
private Bank bank;
public BankAccount(String accountHolderName, String accountNumber, Bank bank) {
this.accountHolderName = accountHolderName;
this.accountNumber = accountNumber;
this.bank = bank;
}
public void displayAccountDetails() {
System.out.println("Account Holder Name: " + accountHolderName);
System.out.println("Account Number: " + accountNumber);
System.out.println("Bank Rate of Interest: " + bank.getRateOfInterest() + "%");
}
}
public class RateOfInterest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Account Holder Name: ");
String name = scanner.nextLine();
System.out.print("Enter Account Number: ");
String accountNumber = scanner.nextLine();
System.out.println("Choose your bank:");
System.out.println("1. SBI");
System.out.println("2. ICICI");
System.out.println("3. AXIS");
System.out.print("Enter your choice (1/2/3): ");
int choice = scanner.nextInt();
Bank chosenBank;
switch (choice) {
case 1:
chosenBank = new SBI();
break;
case 2:
chosenBank = new ICICI();
break;
case 3:
chosenBank = new AXIS();
break;
default:
System.out.println("Invalid choice! Defaulting to SBI.");
chosenBank = new SBI();
break;
}
BankAccount account = new BankAccount(name, accountNumber, chosenBank);
account.displayAccountDetails();
scanner.close();
}
}
