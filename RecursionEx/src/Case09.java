import java.util.Scanner;

// #09
// 2진수로 변환하여 출력
public class Case09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		printBinary(number);
	}

	public static void printBinary(int n) {
		if (n < 2) {
			System.out.print(n);
		} else {
			printBinary(n/2);
			System.out.print(n%2);
		}
	}

}
