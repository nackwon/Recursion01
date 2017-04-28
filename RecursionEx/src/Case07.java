import java.util.Scanner;

// #07
// 문자열의 프린트
public class Case07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		print(str);
	}
	
	public static void print(String str){
		if(str.length() == 0)
			return;
		else{
			System.out.print(str.charAt(0)+" ");
			print(str.substring(1));
		}
	}

}
