package OOP;

public class Student {

	private String name;
	private int rollNum;
	private int marks;
	private int age;

	public Student(String name, int rollNum, int marks, int age) {
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNum != other.rollNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", marks=" + marks + ", age=" + age + "]";
	}

}
