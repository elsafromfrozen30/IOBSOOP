package Review2;

public abstract class Details
{
	String name;
	int age;
	String DOB;
	long aadhaar;
	long phno;
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getDOB();
	public abstract void setDOB(String DOB);
	public abstract int getAge();
	public abstract void setAge(int age);
	public abstract String getAadhaar();
	public abstract void setAadhaar(String adhaar_no);
	public abstract String getPhone();
	public abstract void setPhone(String phno);
	
}
