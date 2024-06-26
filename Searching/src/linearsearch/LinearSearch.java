package linearsearch;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {10,50,60,43,92,5,4};
		
		int num=4;
		int flag = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				flag = 1;
			}
		}
		if(flag==1)
			System.out.println("found");
		else
			System.out.println("Not found");
	}
}
