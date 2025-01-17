package asd;

public class DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=2;i<=100; i++) {
			int cnt=0;
			for(int j=1;j<=100;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				sum=sum+i;}	
		}
	System.out.println(sum);
	}
}

