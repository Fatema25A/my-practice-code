import java.lang.*;
public class Person{
	private int age;
	private String name;
	private double mass;
	public Person()
	{
		System.out.println("Person D.C calling");
	}
	public Person(int age,String name,double mass)
	{
		this.age=age;
		this.name=name;
		this.mass=mass;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMass(double mass)
	{
		this.mass=mass;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public double getMass()
	{
		return mass;
	}
	public void ShowInfo()
	{
		


