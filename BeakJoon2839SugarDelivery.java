import java.util.Scanner;

public class BeakJoon2839SugarDelivery {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int cnt = 0;

		if (N % 5 == 0) {
			System.out.println(N / 5);
		} else {
			while (true) {
				N = N - 3;
				cnt++;

				if (N % 5 == 0) {
					cnt += N / 5;
					System.out.println(cnt);
					break;
				}
				if (N < 3) {
					System.out.println(-1);
					break;
				}
			}
		}
	}
}
