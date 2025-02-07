import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String strNum = input.nextLine();
		strNum = 5 + strNum;
		System.out.println(Integer.parseInt(strNum)+5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String strNum2 = input.nextLine();
		strNum2 = 4 + strNum2 + 3;
		System.out.println(Double.parseDouble(strNum2) + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String strBool = input.nextLine();
		System.out.println(!Boolean.parseBoolean(strBool));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String strNum3 = input.nextLine();
		strNum3 = strNum3 + 3;
		System.out.println((char)(Integer.parseInt(strNum3)+2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String strNum4 = input.nextLine();
		strNum4 = strNum4 + 1;
		System.out.println((double)(Integer.parseInt(strNum4)/2));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String strNum5 = input.nextLine();
		strNum5 = 1 + strNum5;
		System.out.println((int)(Double.parseDouble(strNum5)));
	}

}
