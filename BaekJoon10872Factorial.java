//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class BaekJoon10872Factorial {
	static int Factorial(int num) {
		return num == 0 ? 1:num*Factorial(num-1);
		
//		if (num == 0) {
//		return 1;
//	}
//	return num * Factorial(num - 1);
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(Factorial(num));

	}

}
