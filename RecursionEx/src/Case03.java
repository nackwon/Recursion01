import java.util.Scanner;

// #03
// XÀÇ n½Â ±¸ÇÏ±â
public class Case03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int result = recursion(x, n);
		System.out.println(result);
	}

	public static int recursion(int x, int n){
		if(n == 0)
			return 1;
		 else
			 return x*recursion(x,n-1);
	}
}
