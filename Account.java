package Review2;


import java.util.Scanner;

public class Account {
	int accno;
	int balance;
	String Uname;
	String password;
	String cpassword;
	int loanAmt;
	int depAmt;
	int transAmt;
	
	Scanner in=new Scanner(System.in);
		
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public void getPassword() {
		System.out.println("enter your password here:");
		password = in.next();
	}
	public void confirmPassword() {
		System.out.println("please reenter your password here:");
		cpassword = in.next();
	}
	public void setPassword() {
		if(password.equals(cpassword)) {
			System.out.println("your password is set successfully.");
		}
		else {
			System.out.println("please enter both the passwords correctly");
			getPassword();
			confirmPassword();
			setPassword();
		}
	}
	
	
	
}