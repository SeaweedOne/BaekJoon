import java.util.Arrays;
import java.util.Scanner;

public class BeakJoon1110PlusCycle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String newN;
		newN = Integer.toString(N); //받아온 수를 문자열로 변환 

		int cnt = 0;

		while (true) {
			if (newN.length() < 2) { // 인풋 넘이 1자리면 0을 붙여준다.
				newN = "0" + newN;
			}//문자열로 변환한 수를 인덱스로 나눈 뒤 int형태로 변환 후 더하기해준다.
			int result = Integer.parseInt(newN.split("")[0]) + Integer.parseInt(newN.split("")[1]);
			String tempResult = Integer.toString(result);
			if (result < 10) { //더한 값이 한자리라면 문자열로 변환 후 앞에 0을 붙여준다.
				tempResult = "0" + tempResult;
			}
			
			cnt++; //한번 실행할 때 마다 카운트에 1씩 누적.
			newN = newN.split("")[1] + tempResult.split("")[1]; //newN변수에 기존값의 오른쪽/결과값의 오른쪽 자리를 붙여준다.

			if (Integer.parseInt(newN) == N) { //만약 그 수가 N과 같아진다면 cnt를 출력하고 브레이크
				System.out.println(cnt);
				break;
			}
		}
	}
}
