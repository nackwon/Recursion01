import java.util.Scanner;

// #12
// �ִ밪 ã��
public class Case12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("�迭 �ȿ� ���� �Է��ϼ���.");
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
