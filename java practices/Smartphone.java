import java.lang.*;
public class Smartphone extends Device{
	String operatingSystem;
	public Smartphone(String brand,String model,String operatingSystem)
	{
		super(brand,model);
	this.operatingSystem=operatingSystem;}
	public void makeCall()
	{
		System.out.println("A calling message");
	}
}