import java.lang.*;
public class GamingPhone extends Smartphone{
	String coolingSystemType;
	public GamingPhone(String brand,String model,String operatingSystem,String coolingSystemType)
	{
		super(brand,model,operatingSystem);
		this.coolingSystemType=coolingSystemType;
	}
	public void startGameMode()
	{
		System.out.println("activating game mode with the cooling system");
	}
}
	