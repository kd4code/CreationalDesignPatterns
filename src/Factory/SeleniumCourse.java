package Factory;

public class SeleniumCourse implements Course {
   
	public String getName() {
		return "Selenium Course";
	}

	public String getDuration() {
		return 2+" months";
	}

	public int getFees() {
		return 25000;
	}

}
