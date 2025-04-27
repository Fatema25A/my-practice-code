import java.lang.*;
public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(int an)
	{
		this.accountNumber=an;
	}
	public void setAccountHolderName(String ahn)
	{
		this.accountHolderName=ahn;
	}
	public void setBalance(double b)
	{
		this.balance=b;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void showDetails()
	{
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Account Holder Number: "+this.accountHolderName);
		System.out.println("Balance: "+this.balance);
	}
	public static void main(String[] args)
	{
		Account obj1=new Account();
		obj1.setAccountNumber(12345);
		obj1.setAccountHolderName("John");
		obj1.setBalance(10000.00);
		obj1.showDetails();
	}
}