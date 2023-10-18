package Review2;

import java.util.Scanner;

public class Interest {
	float interest;
	int Principal;
	float Rate;
	int time;
	
	Scanner in=new Scanner(System.in);
	
	public int getPrincipal() {
		return Principal;
	}
	public void setPrincipal(int principal) {
		Principal = principal;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public float getRate() {
		return Rate;
	}
	public void setRate(float Rate) {
		this.Rate =Rate;
	}
	
	public void calculateinterest(int Principal, float interest, float rate){
		interest = (Principal*Rate*time)/100;
	}
	public float getInterest() {
		return interest;
	}

}