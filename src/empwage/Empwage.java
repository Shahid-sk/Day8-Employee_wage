package empwage;

public class Empwage {
	
	public static void main(String[] args) {
		int IS_EMP_FULLTIME_PRESENT = 1;
		int IS_EMP_PARTTIME_PRESENT =2;
		int WAGE_PERHOUR = 20;
		int FULL_DAYHOUR = 8;
		int PART_TIMEHOUR = 4;
		int DAILY_EMPWAGE = 0;
		System.out.println("Welcome to Employee wage simulation program");
		
		/**employee availability*/
		double empcheck=Math.floor(Math.random()*10)%3;
		
		if(empcheck == IS_EMP_FULLTIME_PRESENT) {
			System.out.println("Employee is for full time");
			DAILY_EMPWAGE = WAGE_PERHOUR * FULL_DAYHOUR;
			System.out.println("wage of full time employee is: "+DAILY_EMPWAGE);
		}
		else if(empcheck == IS_EMP_PARTTIME_PRESENT) {
			System.out.println("Employee is for parttime");
			DAILY_EMPWAGE = WAGE_PERHOUR * PART_TIMEHOUR;
			System.out.println("Parttime wage of employee is: "+DAILY_EMPWAGE);
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}