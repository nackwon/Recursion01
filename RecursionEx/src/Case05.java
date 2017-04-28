import java.util.Scanner;

// #04
// Euclid Method
public class Case05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = gcd(a,b);
		System.out.println(result);
	}
	
	public static int gcd(int a, int b){
		if(a<b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		//规过1
		/*if(b == 0)
			return a;
		else
			return gcd(b,a%b);*/
		
		//规过2
		if(a % b == 0)
			return b;
		else 
			return gcd(a,a%b);
	}
}
