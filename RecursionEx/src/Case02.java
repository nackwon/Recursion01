import java.util.Scanner;

// #02
// n! ±¸ÇÏ±â
public class Case02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = recursion(n);
		System.out.println(result);
		
	}
	
	public static int recursion(int n){
		if(n == 1)
			return 1;
		else
			return n * recursion(n-1);
	}
}
