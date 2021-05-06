import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까?
//첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다.
public class BaekJoon1924WeekDays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine(); 
		String[] a = userInput.split(" "); //공백을 기준으로 나누기 
		for (int i = 0; i < a.length; i++) { //나눈 월/일이 한자리라면 0붙여주기
			if (a[i].length() < 2) {
				a[i] = "0" + a[i];
			}
		}
		String inputDate = "2007" + a[0] + a[1]; //yyyyMMdd포맷 맞춰주기
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date date = sdf.parse(inputDate); //인풋데이트를 sdf의 포맷대로 바꿔줌.
			Calendar calendar = Calendar.getInstance(); //캘린더 객체 불러오기 
			calendar.setTime(date);
			int weekDay = calendar.get(Calendar.DAY_OF_WEEK); //요일이 정수형으로 나타남
			String day = "";
			switch (weekDay) { //각각의 케이스에 맞게 문자열 대입 
			case 1:
				day = "SUN";
				break;
			case 2:
				day = "MON";
				break;
			case 3:
				day = "TUE";
				break;
			case 4:
				day = "WED";
				break;
			case 5:
				day = "THU";
				break;
			case 6:
				day = "FRI";
				break;
			case 7:
				day = "SAT";
				break;
			}
			System.out.println(day);
		} catch (ParseException e) {
		}
	}

}
