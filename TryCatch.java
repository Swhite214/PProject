package asd;

import java.io.IOException;

public class TryCatch {
	public static void main(String [] args) {
		try {
            readFile("example.txt");  // 예외 발생
        } catch (IOException e) {
            System.out.println(e.getMessage());  // 예외 메시지를 출력
        }
	}
	 public static void readFile(String fileName) throws IOException {
	        // 파일을 찾을 수 없을 경우 예외 발생
	        throw new IOException("파일을 찾을 수 없습니다.");
	    }
}
