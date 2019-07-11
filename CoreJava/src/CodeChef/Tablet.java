package CodeChef;

import java.util.Scanner;

public class Tablet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int n = 0;
		int budget = 0;
		//int price[] = new int[n];
//		int area[] = new int[n];
		int k = 0;
		for (int i = 0; i < testCase; i++) {
			n = sc.nextInt();
			budget = sc.nextInt();
			for (int j = 0; j < n; j++) {
				int width[] = new int[n];
				width[j] = sc.nextInt();
				int height[] = new int[n];
				height[j] = sc.nextInt();
				int price[] = new int[n];
				price[j] = sc.nextInt();
				int area[] = new int[n];
				area[j] = sc.nextInt();
			}
		}
		for (int i = 0; i < testCase; i++) {
			for (int j = 0; j < n ; j++) {
				int[] price = new int[n];
				int area[] = new int[n];
				if(price [j] <= budget)
					area[k] = area[j];
					k += 1;
			}
		}
		int area[] = new int[n];
		System.out.println(area[k]);
	}

}
