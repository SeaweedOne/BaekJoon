
//각 알파벳에 해당하는 아스키코드 값을 10진법으로 나타내었을 때, 각 자릿수의 합만큼 출력하도록 하는 프로그램을 만들고자 한다. 
import java.util.Scanner;

public class BaekJoon21734SMUPC_Ascii {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char[] input = s.nextLine().toCharArray(); //인풋받아 한글자씩 잘라 배열에 추가 

		for (int i = 0; i < input.length; i++) { //배열의 길이만큼 포문
			int sum = 0; //각 자리 수를 더해줄 변수 정의
			int temp = (int) input[i]; //알파벳 코드를 숫자형식(아스키코드값)으로 변환
			String[] temp2 = ("" + temp).split(""); //숫자를 다시 문자열로 변환하고 한글자씩 잘라 배열에 넣어줌 
			for (int j = 0; j < temp2.length; j++) { //배열의 길이만큼 돌며 각 자리의 숫자를 sum에 누적
				String a = temp2[j];  
				sum += Integer.parseInt(temp2[j]);
			}
			for (int k = 0; k < sum; k++) { //누적된 값만큼 포문돌며 알파벳 출력 (같은줄에)
				System.out.print(input[i]);
			}
			System.out.println(); //다음 결과 출력을 위해 줄바꿈

		}

	}
}
