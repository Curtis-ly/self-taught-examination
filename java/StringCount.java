package experiment;

import java.util.Scanner;

public class StringCount {
	
	private static Scanner scan;

	public static void main(String[] args) {
		int abcCount = 0;
		int numCount = 0;
		int otherCount = 0;
		
		scan = new Scanner(System.in);
		System.out.print("请输入字符串");
		String str = scan.nextLine();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				abcCount++;
			}else if(Character.isDigit(ch[i])) {
				numCount++;
			}else {
				otherCount++;
			}
		}
		
		System.out.println("字母个数"+abcCount);
		System.out.println("数字个数"+numCount);
		System.out.println("其他字符个数"+otherCount);
	}

}
