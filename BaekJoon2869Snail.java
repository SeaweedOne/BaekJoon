import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2869Snail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String temp  = br.readLine();
		String[] tempList = temp.split(" ");
		
		int A = Integer.parseInt(tempList[0]);
		int B = Integer.parseInt(tempList[1]);
		int V = Integer.parseInt(tempList[2]);

		int snail = 0;
		double day = (V - B) / (double)(A - B);
		double tempResult = Math.ceil(day);
		int result = (int) tempResult;
		System.out.println(result);

	}

}
