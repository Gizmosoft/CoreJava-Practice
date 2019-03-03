package com.tech.ninzaz.assignment3;

public class SecondHighest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i , j;
		int n = 0;

		int arr[] = {1,34,2,45,13,22,10,8,7,9};
		for(i=0; i<n-1; i++){					//i<arr.length;i++
			for(j=0; j<n-i-1; j++) {			//int j=0;j<arr.length-i-1;j++
				if(arr[i] > arr[j]) {
					arr[j+1] = arr[j];				//temp = arr[i]
													//arr[i] = arr[j]
													//arr[j] =  arr[i]
					System.out.println(arr[j+1]);
				}
				
			}
		}
				
	} 

}
