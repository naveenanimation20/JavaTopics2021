package StringQuestions;

import java.lang.reflect.Field;
import java.lang.reflect.ReflectPermission;
import java.util.stream.Stream;

public class TestCode {
	static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello World", value.get("G'Day Mate."));
            value.set("Hello Naveen", value.get("G'Day Naveen."));
            value.set("I love java", value.get("Me too, Naveen!"));

        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

	public static void main(String[] args) {
		
		try {
		      // Create a permission object
		      ReflectPermission rp = new ReflectPermission("suppressAccessChecks");

		      // check for permission
		      rp.checkGuard(null);
		      System.out.println("Reflect permission is granted");
		    } catch (SecurityException e) {
		      System.out.println("Reflect permission is not granted");
		    }
		
		System.out.println("Hello World");
		System.out.println("Hello Naveen");
		System.out.println("I love java");
		
		//Stream.of("Naveen").map(e -> new StringBuilder(e).reverse()).forEach(e -> System.out.println(e));

	}
	
	public static boolean isNumeric(String str)
	{
	    return str.matches("^(?:(?:\\-{1})?\\d+(?:\\.{1}\\d+)?)$");
	}

}
