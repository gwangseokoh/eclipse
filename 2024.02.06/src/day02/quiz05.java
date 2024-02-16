package day02;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, sum, weigh;
		int all = 600;
		System.out.print("첫번째 물건의 무게를 입력하시오? : ");
		num1 = input.nextDouble();
		System.out.print("두번째 물건의 무게를 입력하시오? : ");
		num2 = input.nextDouble();
		sum = num1 + num2;
		weigh = all - sum;
		System.out.println("현재 엘리베이터에 허용 무게는"+weigh+"kg 입니다.");
				
	}
}
