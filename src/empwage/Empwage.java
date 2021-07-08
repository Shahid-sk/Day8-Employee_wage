package empwage;

public class Empwage {
	public static final int IS_EMP_FULLTIME_PRESENT = 1;
	public static final int IS_EMP_PARTTIME_PRESENT = 2;
	public static final int WAGE_PERHOUR = 20
	
	public static void main(String[] args) {
		int FULL_DAYHOUR = 8;
		int PART_TIMEHOUR = 4;
		int DAILY_EMPWAGE = 0;
		System.out.println("Welcome to Employee wage simulation program");

		/** employee availability */
		double empcheck = Math.floor(Math.random() * 10) % 3;

		if (empcheck == IS_EMP_FULLTIME_PRESENT) {
			System.out.println("Employee is for full time");
			DAILY_EMPWAGE = WAGE_PERHOUR * FULL_DAYHOUR;
			System.out.println("wage of full time employee is: " + DAILY_EMPWAGE);
		} else if (empcheck == IS_EMP_PARTTIME_PRESENT) {
			System.out.println("Employee is for parttime");
			DAILY_EMPWAGE = WAGE_PERHOUR * PART_TIMEHOUR;
			System.out.println("Parttime wage of employee is: " + DAILY_EMPWAGE);
		} else {
			System.out.println("Employee is absent");
		}

		/* Swithcase started */
		switch ((int) empcheck) {
		case 1:
			System.out.println("Employee is fulltime present");
			DAILY_EMPWAGE = WAGE_PERHOUR * FULL_DAYHOUR;
			break;
		case 2:
			System.out.println("Employee is parttime present");
			DAILY_EMPWAGE = WAGE_PERHOUR * PART_TIMEHOUR;
			break;
		default:
			System.out.println("Employee is absent");
		}
		System.out.println("Employee wage is:" + DAILY_EMPWAGE);
	}
}
