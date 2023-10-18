package Review2;
import java.util.*;
import java.io.*;

class Loan {
		int L_amount,L_duration,rate,choice;
		String L_type;
		char a,d;
		Scanner std = new Scanner(System.in);
		public void Get_LInfo(){
			do{
				System.out.println("Enter Loan type");
				System.out.println("1. Home Loan");
				System.out.println("2. Education Loan");
				System.out.println("3. Vehicle Loan");
				System.out.println("4. Business Loan");
				System.out.println("5. Insurance Loan");
				choice = std.nextInt();
				try{
					if (choice<1 || choice>5) {
						throw new ArithmeticException("Invalid Choice");
					}
				}
				catch(ArithmeticException e) {
					System.out.println(e);
				}
				if (choice==1) {
					L_type="Home Loan";
				}
				else if (choice==2) {
					L_type="Education Loan";
				}
				else if (choice==3) {
					L_type="Vehicle Loan";
				}
				else if (choice==4) {
					L_type="Bussiness Loan";
				}
				else if (choice==5) {
					L_type="Insurance Loan";
				}
				else {
					L_type="Invalid";
				}
			}while(L_type=="Invalid");
		
			do{
				System.out.print("Enter L_amount(minimum Rs.15,000 per month):");
				L_amount = std.nextInt();
				try {
					if(L_amount<15000) {
						throw new ArithmeticException("INVALID LOAN AMOUNT"
								+ "(minimum Rs.15,000 per month)");
					}
				}
				catch(ArithmeticException e) {
					System.out.println(e);
				}
				System.out.print("Do you want to change the amount(Y/N):");
				a = std.next().charAt(0);
			}while(a=='Y'||a=='y');

			do {
				System.out.print("Enter L_duration(1-10 years): ");
				L_duration = std.nextInt();
					try {
						if(L_duration<1 || L_duration>10) {
							throw new ArithmeticException("INVALID LOAN DURATION"
									+ "(minimum 1 year, maximum 10 years)");
						}
					}
					catch(ArithmeticException e) {
						System.out.println(e);
					}
					System.out.print("Do you want to change the duration(Y/N):");
					d = std.next().charAt(0);
			}while(d=='Y'||d=='y');
				
			System.out.print("Enter expected rate : ");
			rate = std.nextInt();
		}
		public void Loan_Details() {
			System.out.println("Loan Type : "+L_type);
			System.out.println("Loan amount : "+L_amount);
			System.out.println("Loan Duration "+L_duration);
			System.out.println("Rate : "+rate);
		}
		
		public void req_success() 
		{
			System.out.println("Your Loan application request has been succesfully sent");
			System.out.println("please wait till the bank contacts you");
			System.out.println("For further clarifications contact:");
			System.out.println("9812345678/ onlinebank@gmail.com");
		}
		public int getLoanAmount()
		{
			return L_amount;
		}
}


