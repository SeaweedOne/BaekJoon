import java.util.Scanner;

public class BaekJoon5585Change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 500, 100, 50, 10, 5, 1 };
		int money = 1000;
		int userInput = sc.nextInt();
		int cnt = 0;
		money -= userInput;

		for (int i = 0; i < arr.length; i++) {
			cnt += money / arr[i];
			money = money % arr[i];
		}
		System.out.println(cnt);
	}
}
