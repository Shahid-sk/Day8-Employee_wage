package empwage;

public class Empwage {

	public static void main(String[] args) {
		int IS_EMP_PRESENT = 1;
		int WAGE_PERHOUR = 20;
		int FULL_DAYHOUR = 8;
		System.out.println("Welcome to Employee wage simulation program");

		/** employee availability */
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_EMP_PRESENT)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

		/** daily employee wage */
		int DAILY_EMPWAGE = WAGE_PERHOUR * FULL_DAYHOUR;
		System.out.println("daily employee wage is: " + DAILY_EMPWAGE);
	}

}