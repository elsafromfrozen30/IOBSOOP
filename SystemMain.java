package Review2;
public interface SystemMain {

	final int numberOfAccounts = 100;
	final int balance = 25000;
	
	public void addAccount();
	public void verifyAccount();
	public boolean checkUniqueUsername();
	public void updateAccount();
	public void deleteAccount();
	public void confirmMsg();
	
}