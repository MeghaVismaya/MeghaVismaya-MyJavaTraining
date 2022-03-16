package training.java.inheritance1;

public class Bank extends User {

	private int pinNumber;
	
	public void setpinNumber()
	{
		pinNumber=getPin(); 
	}

	public void validatePin() {
		setpinNumber();
		if (pinNumber== 1001 || pinNumber == 1234 || pinNumber== 1212) {
			System.out.println(pinNumber + " is a valid pin");
		} else {
			System.out.println(pinNumber + " is an invalid pin");
		}
	}



}
