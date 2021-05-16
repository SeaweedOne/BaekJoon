
//캠핑장을 연속하는 P일 중, L일동안만 사용할 수 있다. 강산이는 이제 막 V일짜리 휴가를 시작했다. 강산이가 캠핑장을 최대 며칠동안 사용할 수 있을까? (1 < L < P < V)
//입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, L, P, V를 순서대로 포함하고 있다. 모든 입력 정수는 int범위이다. 마지막 줄에는 0이 3개 주어진다.
//나올 수 있는 예시 정의
//예시 5 8 15 = 10
//에시 5 8 20 = 14
//예시 20 30 10 = 10
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon4796Camping {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); // 배열의 크기를 모르기때문에 ArrayList 사용

		while (true) { // 사용자 입력을 받아 배열에 넣어주기 만약 사용자의 입력이 "0 0 0"이라면 break 하여 배열 완성
			String temp = s.nextLine();
			arr.add(temp);
			if (temp.equals("0 0 0")) {
				break;
			}
		}

		int testCase = 1; // 문제에 테스트케이스를 함께 출력하도록 요구하였기때문에 testCase 정의
		for (Object a : arr) { // 배열의 요소 하나씩 꺼내오기
			if (a.equals("0 0 0")) { // 만약 꺼내온 배열이 '0 0 0' 이라면 break (division by zero) 방지
				break;
			} else { // 배열이 '0 0 0'이 아니라면 아래의 식 수행
				// 배열에서 꺼내온 값을 공백으로 나누어 정수형태로 변환해줌
				int L = Integer.parseInt(((String) a).split(" ")[0]); // 연속된 날 중 캠핑장을 이용가능일
				int P = Integer.parseInt(((String) a).split(" ")[1]); // 연속된 날 (이용가능일 + 필수공백기)
				int V = Integer.parseInt(((String) a).split(" ")[2]); // 휴가일수

				int days = V / P; // 휴가일자를 연혹된 날로 나눠줌. (필수공백기를 넣어서 계산하기 위해 연속된 날로 나눔)
				int rest = V % P; // 휴가일자를 연속된 날로 나눈 나머지
				int result = 0; // 결과를 저장할 변수
				if (rest < L) { // 나머지 날짜가 이용할 수 있는 날짜보다 작을경우
					result = (days * L) + rest; // days * 이용가능일 + 나머지 날짜 /ex) 5 8 20 -> days = 20/8 =2 , rest = 20%8 =
												// 4, result = 2(이용가능일(5)) + 4 = 14
				} else { // 나머지 날짜가 이용 가능일보다 크거나 같을경우 ( 나머지 날짜가 더 커도 이용가능일 만큼밖에 이용할 수 없다.) days * 이용가능일 +
							// 이용가능일
					result = (days * L) + L;
				}

				if (L >= V) { // 만약 이용날짜가 내 휴가일보다 크거나 같다면 결과는 휴가일만큼으로 바뀜.
					result = V;
				}

				System.out.println("Case " + testCase + ": " + result); // 결과출력
				testCase++; // 다음 testcase를 위해 testcase++
			}
		}
	}
}
