package day02;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, sumtraction;
		System.out.print("올해의 년도를 4자리로 입력하세요? : ");
		num1 = input.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요? : ");
		num2 = input.nextInt();
		sumtraction = num1 - num2;
	    System.out.println("당신의 나이는"+sumtraction+"살 입니다.");
		
	}
}




