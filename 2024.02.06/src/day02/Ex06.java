package day02;

import java.util.Scanner; // import = 특정 기능을 현재 페이지로 가지고온다

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// 자료형 변수명
		int num; 
		String name;
		System.out.print("이름 입력 : ");
		name = input.next(); // 문자열을 입력받을때 사용하는 기능
		System.out.print("수 입력 : ");
		num = input.nextInt(); // 정수만 입력 받겠다
		System.out.println("이름 : "+name);
		System.out.println("입력수 : "+num);
		
		double dou;
		System.out.println("실수입력");
		dou = input.nextDouble(); // 실수를 입력받는다
		System.out.println("실수 : "+dou);
}
}
