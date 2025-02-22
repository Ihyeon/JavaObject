package day13.exception.throws_;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * 메서드, 생성자에서 발생되는 예외 떠넘기기 키워드는 throws 입니다
		 * 
		 * throws가 붙어있는 메서드 or 생성자를 호출할 때는 예외가 발생할 수 있다는 의미가 예외처리를 대신 진행되어야 합니다.
		 * 
		 * throw는 에외처리를 강요할 때, 사용합니다
		 */
		
		
		
		try {
			
//			greeting(10);
			
		} catch (Exception e) {
			System.out.println("잘못된 인덱스가 전달 되었습니다");
		}	
		
		// Throws로 만들어져있는 대표적인 메서드
		Class.forName("홍길동");
		
	}
	
	private static String[] arr = {"홍길동", "이순신", "홍길자" };
			
	public static void greeing(int index) throws Exception {
		
		System.out.println(arr[index]);
	
	}
	
	

}
