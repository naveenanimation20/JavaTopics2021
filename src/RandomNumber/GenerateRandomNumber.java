package RandomNumber;

import java.util.Random;

import io.netty.util.internal.ThreadLocalRandom;

public class GenerateRandomNumber {

	/*
	 * Generate Random Number in Java 1. Random Class 2. Math.random()
	 * 3.ThreadLocalRandom
	 * 
	 * Use cases: Random Number in email: test1234@gmail.com Phone number etc...
	 */

	public static void main(String[] args) {
		//

		Random random = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.println("random int: " + random.nextInt());
			System.out.println("random double: " + random.nextDouble());
			System.out.println("random float: " + random.nextFloat());
			System.out.println("random boolean: " + random.nextBoolean());
		}

		System.out.println("----------");

		for (int i = 1; i <= 5; i++) {
			System.out.println(Math.random());
		}

		System.out.println("----------");

		for (int i = 1; i <= 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
			System.out.println(ThreadLocalRandom.current().nextDouble());
			System.out.println(ThreadLocalRandom.current().nextFloat());
			System.out.println(ThreadLocalRandom.current().nextBoolean());
		}

		System.out.println("-----range-----");
		for (int i = 1; i <= 5; i++) {
			//System.out.println(random.nextInt(100));// 0 to 20
			//System.out.println((int)(Math.random() * 40));
			System.out.println(ThreadLocalRandom.current().nextInt(0,10));

		}

	}

}
