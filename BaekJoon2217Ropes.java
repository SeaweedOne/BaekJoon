
//N(1 ≤ N ≤ 100,000)개의 로프가 있다. 각각의 로프는 그 굵기나 길이가 다르기 때문에 들 수 있는 물체의 중량이 서로 다를 수도 있다.
//하지만 여러 개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있다. k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 각각의 로프에는 모두 고르게 w/k 만큼의 중량이 걸리게 된다.
//각 로프들에 대한 정보가 주어졌을 때, 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량을 구해내는 프로그램을 작성하시오. 모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다.
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon2217Ropes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt(); // testCase만큼 input받아 배열에 넣어주기
		Integer ropes[] = new Integer[testCase]; // 내림차순 정렬을 위한 Integer형태로 배열 정의
		for (int i = 0; i < testCase; i++) {
			ropes[i] = s.nextInt();
		}

		Arrays.sort(ropes, Collections.reverseOrder()); // 내림차훈 정렬

		int result1 = 0; // 비교를 위한 두개의 값 정의
		int result2 = 0;

		for (int i = 0; i < ropes.length; i++) {
			int mul = i + 1;
			result2 = ropes[i] * mul; // 큰자리수부터 꺼내 i+1값을 곱해 result2에 넣어준다.
			if (result2 > result1) { // result1 > result2 일 때 result1 = result2 최종적으로 가장 큰 값이 result1에 저장됨.
				result1 = result2;
			}
		}

		System.out.println(result1); //결과값 출력 

	}

}
