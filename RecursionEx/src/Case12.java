import java.util.Scanner;

// #12
// 최대값 찾기
public class Case12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("배열 안에 값을 입력하세요.");
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		System.out.println(maxTarget(arr, 0, n-1));
	}
	
	public static int maxTarget(int[] data, int begin, int end){
		if(begin>end)
			return 0;
		else if(begin == end)
			return data[begin];
		else
			return Math.max(data[begin], maxTarget(data, begin+1, end));
	}

}
