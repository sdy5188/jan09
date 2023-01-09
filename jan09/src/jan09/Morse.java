package jan09;

import java.util.Arrays;
import java.util.Scanner;

// 문자열을 char[]에 넣기

public class Morse {
	public static void main(String[] args) {
		
		Scanner sc = null;
		String user = null;
		char[] ch = null;
		
		sc = new Scanner(System.in);
		
		System.out.println("모스 부호로 변경할 문장을 입력하세요.");
		System.out.println("입력 : >");
		
		user = sc.nextLine();
		user = user.toUpperCase();	//모두 다 대문자로
		// user.toLowerCase();//소문자로 변경
		//System.out.println(user);
		ch = user.toCharArray();
		
		//System.out.println(Arrays.toString(ch));
		
		//모스부호로 변경하기
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
		
		//닫기
		sc.close();
		
		
		
	}
}
