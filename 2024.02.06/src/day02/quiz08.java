package day02;

import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor, eng, math, sum;
		double avg;
		String name;
		System.out.println("<결과>");
		System.out.print("학생이름 : ");
		name = input.next();
		System.out.print("국어점수 : ");
		kor = input.nextInt();
		System.out.print("영어점수 : ");
		eng = input.nextInt();
		System.out.print("수학점수 : ");
		math = input.nextInt();
		avg = (kor + eng + math)/3.0;
		sum = kor + eng + math;
		System.out.println("=========학생정보==========");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------");
		System.out.printf(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
		
	}
}
