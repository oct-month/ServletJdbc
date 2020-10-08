package entity;

public class Student
{
	private int id;
	private String name;
	private float grade;
	
	public Student()
	{
	}

	public Student(int id, String name, float grade)
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public Student(String name, float grade)
	{
		this.name = name;
		this.grade = grade;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getGrade()
	{
		return grade;
	}

	public void setGradle(float grade)
	{
		this.grade = grade;
	}

	@Override
	public String toString()
	{
		return "{'id':" + id + ", 'name':" + name + ", 'grade':" + grade + "}";
	}
}
