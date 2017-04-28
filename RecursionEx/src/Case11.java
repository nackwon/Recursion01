import java.util.Scanner;

// #11
// 순차탐색(매개변수를 명시화해서)
public class Case11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("값을 입력하세요.");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("찾을 값을 입력하세요");
		int target = sc.nextInt();

		System.out.println("찾을 범위를 입력하세요");
		int begin = sc.nextInt();
		int end = sc.nextInt();

		System.out.println(targetMethod(arr, begin, end, target));
	}

	public static int targetMethod(int[] data, int begin, int end, int target) {
		if (begin > end) {
			System.out.println("찾는 값이 없습니다.");
			return 0;
		} else if (target == data[begin])
			return begin;
		else
			return targetMethod(data, begin + 1, end, target);
	}

}
