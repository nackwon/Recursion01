import java.util.Scanner;

// #11
// ����Ž��(�Ű������� ���ȭ�ؼ�)
public class Case11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("���� �Է��ϼ���.");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("ã�� ���� �Է��ϼ���");
		int target = sc.nextInt();

		System.out.println("ã�� ������ �Է��ϼ���");
		int begin = sc.nextInt();
		int end = sc.nextInt();

		System.out.println(targetMethod(arr, begin, end, target));
	}

	public static int targetMethod(int[] data, int begin, int end, int target) {
		if (begin > end) {
			System.out.println("ã�� ���� �����ϴ�.");
			return 0;
		} else if (target == data[begin])
			return begin;
		else
			return targetMethod(data, begin + 1, end, target);
	}

}
