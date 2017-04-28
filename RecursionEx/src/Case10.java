import java.util.Scanner;
// #10
// 배열의 합구하기
public class Case10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[number];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		int result = arraySum(arr, number);
		System.out.println(result);
	}
	
	public static int arraySum(int[] data, int n){
		if(n<=0)
			return 0;
		else{
			return arraySum(data, n-1)+data[n-1];
		}
	}
}
