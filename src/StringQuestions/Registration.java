package StringQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Registration {
	private String firstName;
	private String lastName;
	private String middleName;
	private ArrayList<ArrayList<Integer>> DOB;
	private ArrayList<ArrayList<String>> Address;
	private long mobile;
	private String email;
	private double salary;
	private String company;
	private String lang[];
	private boolean martialStatus;
	private char gender;

	public Registration(String firstName, String lastName, String middleName, ArrayList<ArrayList<Integer>> DOB,
			ArrayList<ArrayList<String>> Address, long mobile, String email, double salary, String company,
			String lang[], boolean martialStatus, char gender) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.DOB = DOB;
		this.Address = Address;
		this.mobile = mobile;
		this.email = email;
		this.salary = salary;
		this.company = company;
		this.lang = lang;
		this.martialStatus = martialStatus;
		this.gender = gender;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public ArrayList<ArrayList<Integer>> getDOB() {
		return DOB;
	}

	public void setDOB(ArrayList<ArrayList<Integer>> dOB) {
		DOB = dOB;
	}

	public ArrayList<ArrayList<String>> getAddress() {
		return Address;
	}

	public void setAddress(ArrayList<ArrayList<String>> address) {
		Address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String[] getLang() {
		return lang;
	}

	public void setLang(String[] lang) {
		this.lang = lang;
	}

	public boolean isMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(boolean martialStatus) {
		this.martialStatus = martialStatus;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void regForm(Registration reg) {
		System.out.println("The details provided as follows:\n" + reg.getFirstName() + "\n" + reg.getMiddleName() + "\n"
				+ reg.getLastName() + "\n" + reg.getDOB() + "\n" + reg.isMartialStatus() + " " + reg.getGender() + "\n"
				+ reg.getMobile() + " " + reg.getEmail() + Arrays.asList(reg.getLang()) + "\n" + reg.getCompany() + " "
				+ reg.getSalary() + "\n" + reg.getAddress());
		System.out.println(Arrays.toString(reg.getLang()));

	}

}