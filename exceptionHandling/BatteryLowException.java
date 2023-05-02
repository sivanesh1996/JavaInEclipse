package exceptionHandling;

public class BatteryLowException extends Exception {
	
	BatteryLowException()
	{
		super();
	}
	
	BatteryLowException(String s)
	{
		super(s);
	}

}
