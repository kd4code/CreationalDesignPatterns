package Factory;

public class CourseFactory {

	public static Course getCourse(String s)
	{
		if(s.equalsIgnoreCase("Java Course"))
		{
		  return new JavaCourse();	
		}
		else if(s.equalsIgnoreCase("Python Course"))
		{
		  return new PythonCourse();	
		}
		else if(s.equalsIgnoreCase("Selenium Course"))
		{
		  return new SeleniumCourse();	
		}
		else
			return null;
		
	}
}
