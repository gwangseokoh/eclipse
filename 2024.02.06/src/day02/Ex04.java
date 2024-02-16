package day02;

public class Ex04 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println( ch );
		int num = ch; // 자동형 변환
		System.out.println( num );
		char ch02 = (char)num; //강제 형 변환
		System.out.println(ch02);
		
		
		
		
		double d = 1.111;
		float f = (float)1.111;
		float a = 1.111f;  // 실수형으로 변환할때는 위에꺼나 아래꺼 둘중 하나로 사용
		
}
}
