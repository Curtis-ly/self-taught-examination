package experiment;

import java.util.Arrays;
import java.util.Scanner;

public class sort {

	private static Scanner sc;

	public static void main(String[] args) {
		int count = 0;
		int[] arr = new int[5];
		while(count<5) {
			sc = new Scanner(System.in);
			try {
				System.out.println("请输入第"+(count+1)+"整数");
				arr[count]=sc.nextInt();
				count++;
			}catch(Exception e) {
				System.out.println("请输入整数");
			}
		}
		
		for(int x=0;x<arr.length;x++) {
			for(int y=x+1;y<arr.length;y++) {
				if(arr[x]>arr[y]) {
					int temp = arr[y];
					arr[y]=arr[x];
					arr[x]=temp;
				}
			}
		}
		System.out.println("排序后数组:"+Arrays.toString(arr));

	}

}
