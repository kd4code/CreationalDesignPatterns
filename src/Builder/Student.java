package Builder;

public class Student {

	private int id; // mandatory
	private String name; // mandatory
	private int std;
	private String city;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStd() {
		return std;
	}

	public String getCity() {
		return city;
	}

	private Student(StudentBuilder sb) {

		this.id = sb.id;
		this.name = sb.name;
		this.std = sb.std;
		this.city = sb.city;
	}

	public static class StudentBuilder {
		private int id;
		private String name;
		private int std;
		private String city;

		public StudentBuilder(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public StudentBuilder setStd(int std) {
			this.std = std;
			return this;
		}

		public StudentBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", city=" + city + "]";
	}

}
