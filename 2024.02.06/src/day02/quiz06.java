package day02;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double hieght, avg;
		System.out.print("키를 입력하세요? : ");
		hieght = input.nextDouble();
		avg = (hieght-100)*0.9;
		System.out.println("표준 체중은"+avg+"입니다");

		
		
		
		
		System.out.println("========비만도 비율 ========");
		double a, b, c;
		System.out.println("키를 입력하세요? : ");
		b = input.nextDouble();
		System.out.println("현재 체중을 입력하세요? : ");
		c = input.nextDouble();
		a = (c/avg)*100;
		System.out.printf("표준 체중은"+avg+"이고 비만도는"+a+"입니다.");
		
	}
}
