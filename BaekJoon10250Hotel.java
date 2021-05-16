import java.util.Scanner;

public class BaekJoon10250Hotel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		for (int i = 0; i < T; i++) {

			int H = s.nextInt();
			int W = s.nextInt();
			int N = s.nextInt();
			int result = 0;
			if (N % H == 0) {
				result = (H * 100) + (N / H);
			} else {
				result = ((N % H) * 100) + (N / H) + 1;
			}
			System.out.println(result);
		}

	}

}
