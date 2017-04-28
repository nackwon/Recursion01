import java.util.Scanner;

// #06
// 문자열 길이 구하기
public class Case06 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int number = length(st);
		System.out.println(number);
	}
	
	public static int length(String st){
		if(st.equals(""))
			return 0;
		else
			return 1+length(st.substring(1));			
	}
}
