import java.util.Scanner;

public class BaekJoon10870Fibonacci {
	static int Fibonacci(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;

		return Fibonacci(N - 1) + Fibonacci(N - 2);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.println(Fibonacci(n));
	}
}
