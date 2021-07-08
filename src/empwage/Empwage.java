package empwage;

public class Empwage {
	public static void main(String[] args) {
		int IS_EMP_PRESENT = 1;
		System.out.println("Welcome to Employee wage simulation program");
		double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck == IS_EMP_PRESENT)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}

}