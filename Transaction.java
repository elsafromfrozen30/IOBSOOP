package Review2;
import java.util.Scanner;
public class Transaction 
{
	int choice,balance;
    public int transAmt;
    
	public void setTransAmt(int transAmt)
	{
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the money to be transacted:");
	    transAmt = s.nextInt();
	    if (transAmt < 0 || transAmt > 100000) 
	    {
	        throw new IllegalArgumentException();
	    }
	    this.transAmt = transAmt;
	}
	
	public int getTransAmt()
	{
		return this.transAmt;
	}
	
	public int getbal()
	{
		return balance;
	}
	public void setbal(int balance)
	{
		this.balance=balance;
	}
  public void transact()
  {
	  Transaction t = new Transaction();
	  int Accno, ifsc, expmonth, expyear , pin ;
	  long cardno;
	  Scanner s =new Scanner(System.in);
	 
		  System.out.println("Choose your option !");
		  System.out.println("1.Withdrawal");
		  System.out.println("2.Deposit");
		  System.out.println("3.Send Money from your account");
		  System.out.println("Enter any other number to exit!");
		  choice = s.nextInt();
		  switch(choice)
		  {
		    case 1:
		    t.setTransAmt(transAmt);
		    if(balance >= t.getTransAmt())
		    {
		    	balance = balance - t.getTransAmt();
		    	System.out.println("Collect your money!");	    	
		    	System.out.print(t.getTransAmt() + " has been reduced from your account \n");
		    	//System.out.print("Current balance in your account :" + balance + "\n");
		    	
		    }
		    else  
		    {
		    	System.out.println("You dont have sufficient balance in your account!");	
		    }	
		    
		    break;
		    
		    case 2:
		    	t.setTransAmt(transAmt);
		    balance = balance + t.getTransAmt() ;
		    System.out.print("Money has been deposited! \n");
		    System.out.print(t.getTransAmt() + " has been deposited to your account \n");
	    	//System.out.print("Current balance in your account :" + balance + "\n");
		    break;
		    
		    case 3:
		    	System.out.print("Enter the Account number of the receiver:");
		    	Accno = s.nextInt();
		    	System.out.print("Enter the Bank IFSC code of the receiver:");
		    	ifsc= s.nextInt();
		    	t.setTransAmt(transAmt);
		    	System.out.print("Enter your card number:");
		    	cardno = s.nextLong();
		    	System.out.print("Enter your card expiry month (in numbers):");
		    	expmonth = s.nextInt();
		    	System.out.print("Enter your card expiry year:");
		    	expyear = s.nextInt();
		    	System.out.print("Enter your pin:");
		    	pin = s.nextInt();
			    if(balance>= t.getTransAmt())
			    {
			    	System.out.print("Processing your payment... \n");
			    	balance = balance - t.getTransAmt();
			    	System.out.println("Your money has been sent!");	    	
			    	System.out.print(t.getTransAmt() + " has been reduced from your account \n");
			    	//System.out.print("Current balance in your account :" + balance + "\n");
			    }
			    else  
			    {
			    	System.out.println("You dont have sufficient balance in your account! \n");	
			    }	
			    
			    break;
		    default:
		    	throw new IllegalArgumentException("Wrong choice!");
		  }
		  
	  
  }
}