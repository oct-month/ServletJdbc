package beans;

public class AddClass
{
	private String first;
	private String second;
	private String third;
	private double result;
	
	public AddClass()
	{
		this.first = "0";
		this.second = "0";
		this.third = "0";
		this.result = 0.0;
	}

	public String getFirst()
	{
		return first;
	}

	public void setFirst(String first)
	{
		this.first = first;
	}

	public String getSecond()
	{
		return second;
	}

	public void setSecond(String second)
	{
		this.second = second;
	}

	public String getThird()
	{
		return third;
	}

	public void setThird(String third)
	{
		this.third = third;
	}

	public double getResult()
	{
		return result;
	}

	public void setResult(double result)
	{
		this.result = result;
	}
	
	public void calculate()
	{
		double one = Double.parseDouble(first);
		double two = Double.parseDouble(second);
		double three = Double.parseDouble(third);
		result = one + two + three;
	}
}
