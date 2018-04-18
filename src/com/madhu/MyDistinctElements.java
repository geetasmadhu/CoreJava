package com.madhu;

public class MyDistinctElements {

	public static void  printDistrinctElements(int[] arr){
		for(int i=0;i<arr.length;i++){
			boolean isDistrinct=false;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					isDistrinct=true;
					break;
				}
			}
			if(!isDistrinct){
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] nums={5,2,7,2,4,7,8,2,3};
		MyDistinctElements.printDistrinctElements(nums);
	}
}
