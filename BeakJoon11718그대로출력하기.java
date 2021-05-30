import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

//입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
//각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
public class BeakJoon11718그대로출력하기 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

//		Scanner s = new Scanner(System.in);
//		ArrayList<String> arr = new ArrayList<String>();
//
//		for (int i = 0; i < 100; i++) {
//			String temp = s.nextLine();
//			if (temp == null) {
//				break;
//			}
//			arr.add(temp);
//
//		}
//
//		for (Object a : arr) {
//			System.out.println(a);
//		}

	}

}
