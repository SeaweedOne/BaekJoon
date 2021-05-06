import java.util.Scanner;
//손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 
//동전의 개수가 최소가 되도록 거슬러 주어야 한다. 
//거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.

public class BaekJoon14916Changes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int cnt = 0;

		if (n % 5 == 0) { //n이 5의배수라면 5원으로 거슬러줌
			cnt += (n / 5);
			System.out.println(cnt);
		} else { //5의배수가 아니라면 먼저 2씩 뺴보기
			while (true) {
				n -= 2;
				cnt++;
				if (n % 5 == 0) { //빼다가 5의 배수가 된다면 5원으로 거슬러주고 브레이크 
					cnt += (n / 5);
					System.out.println(cnt);
					break;
				}
				if (n < 2) { //뺴다가 거슬러줘야하는 돈이 2보다 작아지면 거스를수 없음 -1출력 후 브레이크 
					System.out.println(-1);
					break;
				}
			}
		}
	}
}
