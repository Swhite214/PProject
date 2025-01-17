package asd;

import java.util.Scanner;

public class AreyouReady {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//반복문 등 탈출은 break 메서드 끝내기는 return
		Scanner scanner = new Scanner(System.in);
		String s;
		while(!(s = scanner.nextLine()).equals("종료")) {
			System.out.println("문자열을 입력하세요");
			//String s = scanner.nextLine();
		System.out.println(s);
		System.out.println("종료를 원하시면 무엇을입력해야할까요");
		//scanner.close();//입력 스트림이 닫혀버리기에 루프가돌수가없음
			//if(s.equals("종료")) {// ==연산자쓰면 둘은 주소값을 비교하기때문에 다른메모리에있기때문에 안됨
				//System.out.println("시스템이 종료되었습니다.");
				//break;
				//}
		//단 저 반복문은 조건이 참이기때문에 끝날수가없어
		//클래스다이어그램 네가 생각한 그거임 메인하나 두고 클래스별로 기능들 모아놓은거
		//ex 결제기능 게시판기능 인앱기능 등등.
	}
	scanner.close();
}
}
