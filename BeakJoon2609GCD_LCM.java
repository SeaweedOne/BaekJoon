//두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class BeakJoon2609GCD_LCM {
	//최대공약수 구하는 메소드 작은수 / (큰수 % 작은수의 값) 을 계속 하다가 그 나머지가 0이되면 큰 값이 최소공배수 
	static int GCD(int a, int b) {
		int temp, N;
		if (a < b) { //두 수 중 어떤 수가 더 큰지 판별하는 로직
			temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) { //나머지가 0이되는 순간까지 반복문 (재귀함수로도 풀 수 있다)
			N = a % b;
			a = b;
			b = N;
		}
		return a; //큰수를 리턴
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int GCD = GCD(a, b); //메소드 호출
		int LCM = (a *b) / GCD; //최대공배수 = (큰수 * 작은수)/최소공약수
		System.out.println(GCD);
		System.out.println(LCM);
	}

}
