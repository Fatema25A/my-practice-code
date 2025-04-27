import java.lang.*;
public class Device{
	String brand;
	String model;
	public Device(String brand,String model){
		this.brand=brand;
		this.model=model;
		
	}
	public void powerOn()
	{
		System.out.println("a device startup message");
	}
}
	