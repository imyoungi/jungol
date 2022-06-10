package day_0610;

import java.util.Scanner;

public class Ex_562 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
//		int[] arr = new int[10];
		for (int i = 1; i < 11; i++) {
			int num = s.nextInt();
//			arr[i] = num;
			if (i % 2 == 0) {
				sum1 += num;

			} else {
				sum2 += num;
			}

		}
		
		System.out.println("sum : " + sum1);
		System.out.printf("avg : %.1f\n",(double)sum2/5);

//		while(true) {
//			if(count<=10) {
//		}
//			for(int i=10; 
//			System.out.println();
//			
//			System.out.println("avg : "+(double)sum/count);
//		}

	}

}
