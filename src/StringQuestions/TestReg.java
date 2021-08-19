package StringQuestions;

import java.util.ArrayList;

public class TestReg {

	public static void main(String[] args) {
		// ArrayList<ArrayList<String>> DOB

		ArrayList<Integer> date = new ArrayList<Integer>(3);
		date.add(5);
		ArrayList<Integer> month = new ArrayList<Integer>(3);
		month.add(5);
		ArrayList<Integer> year = new ArrayList<Integer>(3);
		year.add(1970);

		ArrayList<ArrayList<Integer>> DOB = new ArrayList<ArrayList<Integer>>();
		DOB.add(date);
		DOB.add(month);
		DOB.add(year);

		// ArrayList<ArrayList<String>> Address
		ArrayList<String> house = new ArrayList<String>(3);
		house.add("5");
		house.add("B Block");

		ArrayList<String> street = new ArrayList<String>(5);
		street.add("Ethel st");
		street.add("before Galston exit");

		ArrayList<String> suburb = new ArrayList<String>(2);

		suburb.add("Wellington");

		ArrayList<String> city = new ArrayList<String>(2);

		city.add("NY");

		ArrayList<String> country = new ArrayList<String>(2);

		country.add("USA");

		ArrayList<ArrayList<String>> Address = new ArrayList<ArrayList<String>>();
		Address.add(house);
		Address.add(street);
		Address.add(suburb);
		Address.add(city);
		Address.add(country);

		String lang[] = new String[] { "English", "French", "German" };

		Registration r1 = new Registration("John", "Doe", "Jimmy", DOB, Address, 0323223, "john123@abc.com", 34.56,
				"Dell", lang, true, 'M');

		r1.regForm(r1);

		r1.setCompany("Google");
		r1.setSalary(90.89);

		r1.regForm(r1);

	}

}
