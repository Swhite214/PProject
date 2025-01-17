package asd;

import java.util.Scanner;

public class ScannerTest04 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Scanner 객체를 처음에 하나만 사용
	        System.out.println("숫자만 입력해주세요");

	        // 반복문을 통해 예외가 발생하더라도 계속 숫자를 받도록 합니다.
	        while (true) {
	            try {
	                int c = scanner.nextInt(); // 숫자 입력을 시도
	                System.out.println(c + " 가능해?");
	                break; // 숫자가 제대로 입력되었으면 반복 종료 브레이크는 블록을탈출
	            } catch (Exception e) { // 예외 발생 시 catch
	                System.out.println("숫자만 입력하라고");
	                scanner.nextLine(); // 잘못된 입력을 처리하고 버퍼를 비움
	            }
	        }

	        scanner.close(); // 입력 종료 후 scanner 닫기
	    }
}
