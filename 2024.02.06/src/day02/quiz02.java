package day02;

import java.util.Scanner;

public class quiz02 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String name;
	int kor, eng, mat;
	int sum;
	System.out.println("=============");
	System.out.print("이름 : " );
	name = input.next();
	System.out.println("=============");
	System.out.print(name+"님의 국어 점수 : " );
	kor = input.nextInt();
	System.out.print(name+"님의 영어 점수 : " );
	eng = input.nextInt();
	System.out.print(name+"님의 수학 점수 : " );
	mat = input.nextInt();
	sum = kor + eng + mat;
	System.out.println("=============");
	System.out.println("합계 : "+sum);
	System.out.println("=============");
	

}
}
