package Review2;
import java.util.*;
import java.io.*;
public class Customer extends Details 
{
	String F_name,L_name,gender,uname,pwd;
	String pn;
	String yn,ad;
	int age, ch;
	String DOB, phone_no;
	String adhaar_no,address;
	Bank b=new Bank();
	InputStreamReader read=new InputStreamReader(System.in);
	BufferedReader in=new BufferedReader(read);
	Account a=new Account();
	public  String getName()
	{
		return F_name+" "+L_name;
	}
	public  void setName(String name)
	{
		this.name=F_name+" "+L_name;
	}
	public  String getDOB()
	{
		return DOB;
	}
	public  void setDOB(String DOB)
	{
		this.DOB=DOB;
	}
	public  int getAge()
	{
		return age;
	}
	public  void setAge(int age)
	{
		this.age=age;
	}
	public  String getAadhaar()
	{
		return adhaar_no;
	}
	public  void setAadhaar(String adhaar_no)
	{
		this.adhaar_no=adhaar_no;
	}
	public  String getPhone()
	{
		return phone_no;
	}
	public  void setPhone(String phno)
	{
		this.phone_no=phone_no;
	}
	public  String getUname()
	{
		return uname;
	}
	public  void setUname(String uname)
	{
		this.uname=uname;
	}
	public  String getPwd()
	{
		return pwd;
	}
	public  void setPwd(String pwd)
	{
		this.pwd=pwd;
	}
	public  void Get_CInfo() throws IOException{
		System.out.print("Enter First Name: ");
		F_name = in.readLine();
		
		System.out.print("Enter Last Name: ");
		L_name = in.readLine();
	
		System.out.print("Enter DOB(DD/MM/YYYY): ");
		DOB = in.readLine();
		
		System.out.print("Enter Age: ");
		age = Integer.parseInt(in.readLine());
		System.out.print("Enter Gender: ");
		gender = in.readLine();
		
		System.out.print("Enter Address: ");
		 address = in.readLine();
		
		 System.out.print("Enter Branch: ");
		 b.branch = in.readLine();
		 System.out.print("Enter Branch Code: ");
		 b.branchCode = Integer.parseInt(in.readLine());
		do{
			System.out.print("Enter Aadhaar Number: ");
			adhaar_no = in.readLine();
			try {
				if(adhaar_no.length()<12) {
					throw new ArithmeticException("INVALID AADHAAR NUMBER"
							+ "(should have excatly 12 numbers)");
				}
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			System.out.print("Do you want to change Adhaar no(Y/N):");
			ad = in.readLine();
		} while(ad.equalsIgnoreCase("Y"));
		
		
		do {
			System.out.print("Enter Phone Number: ");
			 phone_no = in.readLine();
			try {
				if(phone_no.length()<10) {
					throw new ArithmeticException("INVALID PHONE NUMBER"
							+ "(should have excatly 10 numbers)");
				}
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			System.out.print("Do you want to change phone no(Y/N):");
			pn = in.readLine();
			}while(pn.equalsIgnoreCase("Y"));
		
			System.out.println("Enter a unique username");
			a.Uname=in.readLine();
			a.getPassword();
			a.confirmPassword();
			a.setPassword();
	
			System.out.println("Do you want to proceed to login?Y/N");
			yn=in.readLine();		
			if(yn.equalsIgnoreCase("y"))
			
			login();
		
	}
	public void login() throws IOException
	{
		do {
		System.out.println("Enter username:");
		uname=in.readLine();
		System.out.println("Enter password, "+uname+"!");
		pwd=in.readLine();
		if(!(uname.equals(a.Uname)&& pwd.equals(a.password)))
			System.out.println("Please try again! Invalid username/password.");
		else
			break;
        
		}while(!(uname.equals(a.Uname)&& pwd.equals(a.password)));
		
		
	}
	
	public void viewDetails() {
		System.out.println("First Name:" +F_name);
		System.out.println("Last Name:" +L_name);
		System.out.println("Username:" +a.getUname());
		System.out.println("DOB:" +DOB);
		System.out.println("Age:" +age);
		System.out.println("Gender:" +gender);
		System.out.println("Address:" +address);
		System.out.println("Adhaar Number:" +adhaar_no);
		System.out.println("Phone Number:" +phone_no);
	}
}

	

	
	
