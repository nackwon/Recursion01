import java.util.Scanner;

// #08
// 문자열 뒤집어 프린트
public class Case08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reversePrint(str);
	}
	
	public static void reversePrint(String str){
		if(str.length() == 0){
			return;
		}
		else{
			reversePrint(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
}
