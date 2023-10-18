package Review2;
import java.util.Scanner;

class Deposit {
		int D_amount,D_duration,rate,choice;
		String D_type;
		char a,d;
		Scanner std = new Scanner(System.in);
		public void Get_DInfo(){
			System.out.println("Enter Deposit type:");
			System.out.println("1.Fixed Deposit");
			System.out.println("2.Salary Deposit");
			System.out.println("3.Saving Deposit");
			System.out.println("4.Recurring Deposit");
			choice = std.nextInt();
				try{
					if (choice<1 || choice>4) {
						throw new ArithmeticException("Invalid Choice");
					}
				}
				catch(ArithmeticException e) {
					System.out.println(e);
				}
				if (choice==1) {
					D_type="Fixed Deposit";
				}
				else if (choice==2) {
					D_type="Salary Deposit";
				}
				else if (choice==3) {
					D_type="Saving Deposit";
				}
				else if (choice==4) {
					D_type="Recurring Deposit";
				}
				else {
					D_type="Invalid";
				}
			
			do {
				System.out.print("Enter Deposit amount(minimum Rs.1,000): ");
				D_amount = std.nextInt();
					try {
						if(D_amount<1000) {
							throw new ArithmeticException("INVALID DEPOSIT AMOUNT"
									+ "(minimum Rs.1,000)");
						}
					}
					catch(ArithmeticException e) {
						System.out.println(e);
					}
				System.out.print("Do you want to change the deposit amount(Y/N):");
				a = std.next().charAt(0);
			}while(a=='Y'||a=='y');
			
			do {
				System.out.print("Enter D_duration(1 week- 520 weeks[10 years]): ");
				D_duration = std.nextInt();
					try {
						if(D_duration<1||D_duration>520) {
							throw new ArithmeticException("INVALID DEPOSIT DURATION"
									+ "(minimum 1 week, maximum 520 week(10 years)");
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
		
		public void Deposit_Details() {
			System.out.println("Deposit Type : "+D_type);
			System.out.println("Deposit amount : "+D_amount);
			System.out.println("Deposit Duration "+D_duration);
			System.out.println("Rate : "+rate);
		}
		
		public void req_success() 
		{
			System.out.println("Your Deposit application has been succesfully sent");
			System.out.println("please wait till the bank contacts you");
			System.out.println("For further clarifications contact:");
			System.out.println("9812345678/ onlinebank@gmail.com");
		}	
		public int getDepAmount()
		{
			return D_amount;
		}
}

