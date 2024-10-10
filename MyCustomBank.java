package Lab7;
import java.util.Scanner;
class CustomBank{
	Scanner sc=new Scanner(System.in);
	int accountNo,inBal,balance,depo,accNum;
	String actype,name;
	void openAccount() {
		System.out.println("Enter Account Number: ");
	    accountNo=sc.nextInt();
		System.out.println("Enter Account Type: ");
		actype=sc.next();
		System.out.println("Enter Name: ");
		name=sc.next();
		
		System.out.println("Enter Initial Balance: ");
		inBal=sc.nextInt();
		balance+=inBal;
		System.out.println("Account created Successfully!");
	}
	void displayAccount() {
		System.out.println("Name :"+name);
		System.out.println("Account Number: "+accountNo);
		System.out.println("Account Type: "+actype);
		System.out.println("Balance: "+balance);		
	}
	void deposit() {
		System.out.println("Enter the deposit Amount:");
		int depo=sc.nextInt();
		try {
			if(depo<=0) {
				throw new InvalidAmountException("Enter valid Amount!");
			}
			else {
			balance+=depo;
			System.out.println("Deposit Successful!....New Balance :"+balance);
			}
			}catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}		
	}
	void withdray() {
		System.out.println("Enter the amount to Withdraw: ");
		int depo=sc.nextInt();
		try {
		if(depo<=0) {
			throw new InvalidAmountException("Invalid Amount! Enter valid Amount!");
		}
		else if (depo>balance) {
			throw new InsufficientFundsException("Insufficient Fund! Enter valid Amount!");
		}
		else {
		balance-=depo;
		System.out.println("Withdrawal Successful!....New Balance :"+balance);
		}
		}catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
	void searchAccount() {
		System.out.println("Enter the Account Number to search: ");
		int accNum=sc.nextInt();
		if(accNum==accountNo) {
			System.out.println("Name :"+name);
			System.out.println("Account Number: "+accountNo);
			System.out.println("Account Type: "+actype);
			System.out.println("Balance: "+balance);	
		}
		else {
		System.out.println("Account is not found!");
		}
	}
}
public class MyCustomBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CustomBank cb=new CustomBank();
		
		System.out.println("***Banking System Application***");
		System.out.println("1. Open New Account");
		System.out.println("2. Display Account Details");
		System.out.println("3. Deposit Amount");
		System.out.println("4. Withdray Amount");
		System.out.println("5. Search Account");
		System.out.println("6. Exit");		
	String option;
	do {
		System.out.println("\nEnter your choice: ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			cb.openAccount();
			break;
		case 2:
			cb.displayAccount();
			break;
		case 3:
			cb.deposit();
			break;
		case 4:
			cb.withdray();
			break;
		case 5:
			cb.searchAccount();
			break;
		case 6:
			System.out.println("Thankyou !");
			break;
		default:
			System.out.println("Enter a valid choice !");
			break;
		}		
		System.out.println("Do you Want to continue: (y/n)");
	    option=sc.next();
	}while(option.equals("y"));	
	sc.close();
	}
}
