package exception01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//예외 처리 Exception
/*
 * 자바의 예외
 * 자바에서는 예외라는 것을 두고 목적에 따라서 처리(핸들링)하도록
 * 되어있습니다.
 * 일단 예외란 주로 실행시 발생되는 모든 에러 상황을
 * 예외라고 정의 하고 있습니다.
 * 물론 특정 API는 컴파일시 예외를 처리하지 않으면
 * 컴파일 되지 않는 예외도 있습니다.
 * 
 * -> 예외의 정의 : 실행시에 발생할 수 있는 모든 에러 상황
 * 
 * 자바에서는 예외가 발생하는 순서가 아래와 같습니다.
 * 
 * 컴파일 -> 실행 -> 실행중 예외발생 -> VM이 발생된 예외의 종류 및
 * 내용을 파알한 뒤 예외객체를 생성함 -> 발생된 코드를 
 * 밖으로 던짐(Throw) -> 예외의 콜 스택에 전이 
 * -> main메소드 밖으로 던지게 되면 프로그램 비정상 종료
 * 
 * ->위에 보듯 예외는 던지다 라는 표현을 씁니다.
 * 또한 예외는 객체이기 떄문에 당연 클래스로 정의되어 있습니다.
 * 
 * 
 * 예외의 최고 클래스
 * 예외의 최고 클래스는 lang 패키지의 Throwable 입니다.
 * 자식 클래스로는 Error 와 Exception 이 있는데
 * Error 의 하위타입은 일반적으로 자바 실행기(VM)에 관련된
 * 에러 상황들을 정의한 클래스 입니다.
 * 이러한 문제들은 프로그래머가 처리할 수 없는 것들로
 * VM, JRE의 전체 문제이기도 합니다.
 * 따라서 프로그래머는 Error의 하위 타입의 예외(Error)는
 * 처리할 수 없습니다.
 * 
 * 다음 Exception이란 클래스의 하위 타입들이 바로 프로그래머가
 * 처리해야 할 예외입니다.
 * 따라서 보통 예외다 라고 표현할떄 최고 클래스는
 * Exception 입니다.
 * 
 * Throwable클래스는 자식으로 Error을 가지고 있기 떄문에
 * 예외의 최고 클래스라고 하지 않습니다.
 * 
 * 예외의 종류
 * 크게 두가지로 나뉩니다.
 * 
 * 알려지지 않은 예외
 *       컴파일러가 관여하지 않으면서 실행시에 예외가 발생할수도
 *       발생하지 않을 수도있는 예외
 * 
 * 알려진 예외
 *       컴파일러가 알려진 예외
 * 
 * 구분하는 방법 :
 * 		Exception의 하위 클래스 중 RuntimeException이 있는데
 * 		해당 클래스의 자식 클래스는 모두 알려지지 않은 예외
 * 		나머지는 모두 알려진 예외입니다.
 * 
 */
public class Excep01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		
		try {
			System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//IOException input output예외
		
	///////////////////////////////////////////
	try {
		FileReader fr = new FileReader("c:\temp\temp.txt");
		//예외가 발생할 것 같은 문장...........
	} catch (FileNotFoundException e) {
		//e.printStackTrace();
		System.out.println("예외가 발생한다면");
		System.out.println("처리할 명령어가 이 자리에...");
	}
	
	
	
	
	
	
	}
}
