package day11.static_.singleton;

public class MainClass {  
	
	
	public static void main(String[] args) {

//		Singleton s = new Singleton(); // err
		
		// 3번의 getInstance()로 객체를 끄집어 낸다
		
		Singleton s = Singleton.getInstance(); // 객체 생성 방법
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s == s2);
		Singleton.getInstance();
		
		String name = s.getName();
		String name2 = s2.getName();
		
		System.out.println(name); // 둘 다 홍길동
		System.out.println(name2); // 둘 다 홍길동
		
	}

}
