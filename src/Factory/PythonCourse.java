package Factory;

public class PythonCourse implements Course {

	public PythonCourse()  {}
	
	public String getName() {
		return "Python Course";
	}

	public String getDuration() {
		return 4+" months";
	}

	public int getFees() {
		return 40000;
	}

}
