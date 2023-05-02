package exceptionHandling;

public class MobileBattery {

	int charge;
	
	void batteryLevel(int charge)
	{
		if(charge<15 && charge>10)
		{
			try {
			//throw new BatteryLowException("Please charge and use \nBattery below 15%");
				BatteryLowException e=new BatteryLowException("Please charge and use \nBattery below 15%");
				throw e;
			}
			catch(BatteryLowException e)
			{
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
		
		
		if(charge<5 && charge>2)
		{
			try {
			throw new BatteryLowException("Please charge Immediately \nBattery below 5%");
			}
			catch(BatteryLowException e)
			{
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
		
		
		if(charge<1)
		{
			try {
			throw new BatteryLowException("Battery about to die");
			}
			catch(BatteryLowException e)
			{
				System.out.println(e.getMessage());
				//e.printStackTrace();
				shutDown();
			}
		}
		
		
		
	}
	
	void shutDown()
	{
		System.out.println("Mobile Turning Off \nBye Bye");
	}
	
	public static void main(String[] args) {
		
		MobileBattery m=new MobileBattery();
		m.batteryLevel(13);
		

	}

}
