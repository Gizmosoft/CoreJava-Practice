package CodeChef;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] name = new String[12][12];
		String surname = new String();
		int t = sc.nextInt();
		for (int m = 0; m < t; m++) {
			int n = sc.nextInt();
			int k=0;
			for (int i = 0; i < n; i++) {
				name[i][12] = sc.nextLine();
				surname = sc.nextLine();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(name.compareTo(surname)==0){
						k += 1;
					}
					if(k>=2)
					break;
				}
				if(k==2){
					System.out.println(name[i] + " " + surname[i]);
				}
			}
		}
	}

}
