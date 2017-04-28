import java.util.Scanner;

// #04
// Fibonacci Number
public class Case04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = fibonacci(n);
		System.out.println(result);
	}

	public static int fibonacci(int n){
		if(n < 2)
			return n;
		else
			return fibonacci(n-2)+fibonacci(n-1);
	}
}
