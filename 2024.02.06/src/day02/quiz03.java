package day02;

import java.util.Scanner;

public class quiz03 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

	// int num1;
	System.out.println("숫자입력 : ");
	int n1 = input.nextInt();
    String result;
    String result2;
    result = (n1%2==0)?"짝수":"홀수";
    System.out.println(result);
    result2 = (n1%3==0)?n1+"": "3의배수가아니다";
    System.out.println(result2);
	
    int num1= 10, num2 = 20;
	String result1;
	result1 = (num1<num2)?"num2가 num1보다 크다":"num2가 num1보다 작다";
	System.out.println(result1);
	
	
	
	int a, b;
	System.out.println("두 수를 입력 : ");
	a = input.nextInt();
	b = input.nextInt();
		int max;
		max =(a>b)?a:b;
		if (max%2==0) {
		System.out.println("큰수는 짝수입니다");}
		else {
		System.out.println("아님");
		}

	}
}
