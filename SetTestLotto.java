package asd;

class Calc<T>{//타입 파라미터 안정해주면 Object로 됨 여러개로 해도됨
	/*
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	String add(String a, String b) {
		return a+b;
	}
	*/
	T result; //제네릭
	void print(T a) {
		System.out.println(a);
	}
	
	
	Object add(Object a, Object b) {//이렇게안하면 a,b가 무슨타입으로 들어오냐에따라 a,b더할수있고 없고 반환값등 문제가생기기에 저렇게안하면 코드 작동안함
		return (Integer)a +(Integer)b;
	}
}

public class SetTestLotto {

	public static void main(String[] args) {
		Calc<Integer> calc = new Calc<Integer>();//int등의 기본형 사용불가 래퍼클래스로 써야함
		Calc<Double> calcq = new Calc<>();//이런식으로 생성자에서 다이아몬드안에 생략가능
		//이렇게 하나의 메서드를 다양한 데이터타입으로 즐길수 있어요~
		Calc<String> calcqw = new Calc<>();//()이거 꼭써야됨
 		//System.out.println(calc.add(10, 20));
		//System.out.println(calc.add(30.2,20.3));
		//System.out.println(calc.add("이백만","지르면~"));
		int n=10;
		Integer n1 = n; //오토 박싱
		n=n1;//오토언박싱
		
		Object obj = n1;//흡사 포장지
		//큰타입은 작은타입의 객체를 담을수있다 = 다형성
		n1=(Integer)obj; //강제형변환 캐스팅
		calc.print(10);
		calcq.print(4.34);
		calcqw.print("사람이읎다.");
	}

}
