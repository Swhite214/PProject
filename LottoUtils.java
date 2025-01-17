package asd;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LottoUtils {
	private final static int EA = 6;
    // 랜덤 객체
    private final static Random rd = new Random();
    private LocalDateTime now=LocalDateTime.now();
	public void today() {

		DateTimeFormatter formatter=
				DateTimeFormatter.ofPattern("yyyy/MM/dd (E) HH:mm:ss");
 
        System.out.println("발행일: "+ formatter.format(now));
	}
	public void drawdayFormat() {
		int daysOfSaturday=
				DayOfWeek.SATURDAY.getValue() - now.getDayOfWeek().getValue();
		//System.out.println("토요일까지 "+day+"일 남음");
		LocalDateTime saturday=now.plusDays(daysOfSaturday);
		DateTimeFormatter formatter=
				DateTimeFormatter.ofPattern("yyyy/MM/dd (E)");
		System.out.print("추첨일: "+ formatter.format(saturday));
		System.out.println(" TR:"+ rd.nextInt(1,99999));}
	public Set<Integer> createLottoNumbers(){
		Set<Integer> lottoNums = new TreeSet<>();
		while (lottoNums.size() < EA) {
            int num = rd.nextInt(45) + 1; // 1부터 45까지의 랜덤 번호
            lottoNums.add(num); // 중복된 번호는 자동으로 제거
        }
		return lottoNums;
	}
	public void print(int money) {
		char prefix='A';
		int line=money/1000;
		today();
		drawdayFormat();
		System.out.printf("--------------\n");
		for(int i=0; i<line; i++) {
			System.out.printf(" %c 자 동 ", prefix++);
			for(int num : createLottoNumbers()) {
				System.out.printf("%02d",num);
			}
			System.out.println();
		}
		System.out.printf("-------------------\n");
		NumberFormat format=NumberFormat.getCurrencyInstance(Locale.KOREA);
		System.out.println("금   액                  "+format.format(money));
		System.out.printf("---------------------\n");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
