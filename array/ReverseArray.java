public class ReverseArray{
	static void reverse(int arr[],int n){
		int rarr[]=new int[n];
		int m=n;
		for(int i=0;i<n;i++){
			rarr[m-1]=arr[i];
			m--;
		}
		System.out.println("Array Elements:");
		for(int j=0;j<n;j++){
		System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("Reverse Array Elements:");
		for(int j=0;j<n;j++){
		System.out.print(rarr[j]+" ");
		}
	}
	public static void main(String args[]){
		int arr[]={5,6,4,2,9,7};
		int n=arr.length;
		reverse(arr,n);
	}
}