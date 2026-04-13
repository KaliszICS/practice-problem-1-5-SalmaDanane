import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		char latter = 'a' ;
		System.out.println(latter);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		char bird;
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		bird = word.charAt(2);
		System.out.println(bird);

	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		char mint;
		String flint;
		System.out.print("Input a word: ");
		flint = input.nextLine();
		mint = flint.charAt(1);
		System.out.println("The second character user entered was: " + mint);
	}

	public static void q4() {
		//
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a number: ");
		num = input.nextInt();
		int bum = num + 1;
		System.out.println("Your number plus 1 is: " + bum);
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);

		char wum;
		System.out.print("Input a letter: ");
		wum = input.next().charAt(0);


		char wum2;
		System.out.print("Input another letter: ");
		wum2 = input.next().charAt(0);

		int result = wum + wum2;
		System.out.println(result);
	}

}
