package day02;

public class Ex03 {
	public static void main(String[] args) {
		char ch = 'A'; // '' = 문자 하나
		int num = 5;
		int ret;
		ret = ch + num;
		System.out.println("A + 5 = "+ret); // 아스키코드 A = 65
		System.out.println("ch :  "+ch);
		System.out.println("num : "+num);
		
		String str = "hello"; //string = 문자열
		System.out.println("변경 전 str : " +str);
		str = "test";
		System.out.println("변경 후 str : "+str);
	
}
}
