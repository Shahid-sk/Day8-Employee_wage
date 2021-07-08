package empwage;

public class Empwage {

	public static void main(String[] args) {
		int IS_EMP_FULLTIME_PRESENT = 1;
		int IS_EMP_PARTTIME_PRESENT = 2;
		int WAGE_PERHOUR = 20;
		int FULL_DAYHOUR = 8;
		int PART_TIMEHOUR = 4;
		int DAILY_EMPWAGE = 0;
		int WORK_DAYS = 20;
		int MONTLY_EMPWAGE = 0;
		System.out.println("Welcome to Employee wage simulation program");

		/** employee availability */
		double empcheck = Math.floor(Math.random() * 10) % 3;

		if (empcheck == IS_EMP_FULLTIME_PRESENT) {
			System.out.println("Employee is for full time");
			DAILY_EMPWAGE = WAGE_PERHOUR * FULL_DAYHOUR;
			System.out.println("wage of full time employee is: " + DAILY_EMPWAGE);
			MONTLY_EMPWAGE = DAILY_EMPWAGE * WORK_DAYS;
			System.out.println("Montly wage of an employee is:" + MONTLY_EMPWAGE);
		} else if (empcheck == IS_EMP_PARTTIME_PRESENT) {
			System.out.println("Employee is for parttime");
			DAILY_EMPWAGE = WAGE_PERHOUR * PART_TIMEHOUR;
			System.out.println("Parttime wage of employee is: " + DAILY_EMPWAGE);
			MONTLY_EMPWAGE = (DAILY_EMPWAGE * WORK_DAYS);
			System.out.println("Montly wage of an employee is:" + MONTLY_EMPWAGE);
		} else {
			System.out.println("Employee is absent");
		}

		/* Swithcase started */
		switch ((int) empcheck) {
		case 1:
			System.out.println("Employee is fulltime present");
			DAILY_EMPWAGE = WAGE_PERHOUR * FULL_DAYHOUR;
			MONTLY_EMPWAGE = DAILY_EMPWAGE * WORK_DAYS;
			System.out.println("Montly wage of an employee is:" + MONTLY_EMPWAGE);
			break;
		case 2:
			System.out.println("Employee is parttime present");
			DAILY_EMPWAGE = WAGE_PERHOUR * PART_TIMEHOUR;
			MONTLY_EMPWAGE = DAILY_EMPWAGE * WORK_DAYS;
			System.out.println("Montly wage of an employee is:" + MONTLY_EMPWAGE);
			break;
		default:
			System.out.println("Employee is absent");
		}
		System.out.println("Employee wage is:" + DAILY_EMPWAGE);
	}
}