import java.util.Scanner;

// #01
// 1~n±îÁö ÇÕ
public class Case01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = recursion(n);
		System.out.println(result);
		
	}
	
	public static int recursion(int n){
		if(n == 0)
			return 0;
		else
			return n + recursion(n-1);
	}
}
