package asd;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Lotto {
    // 로또 번호의 개수
    // 랜덤 객체
    public static void main(String[] args) {
        System.out.println("로또 한장에 1000원");
        // 사용자로부터 금액 입력 받기
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        scanner.close();
        do {
			int totalLine=money/1000;
			if(money%1000>0) {
				System.out.println("1000원단위로 입력하세요");
				break;
			}
			int printMoney=totalLine<5 ? totalLine*1000 : 5000;
			LottoUtils lu=new LottoUtils();
			lu.print(printMoney);//1000~5000)
			money -= printMoney;
		}while(money > 0);
        
        
        
        // 거스름돈 계산
        System.out.println("거스름돈: " + money % 1000);
    }
}