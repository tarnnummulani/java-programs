public class DupElements{
	public static void main(String args[]){
		String[] arr = {"geeks","for","geeks"};
		for(int i=0;i<arr.length-1;i++){
			for(int j=1;j<arr.length;j++){
				if((arr[i].equals(arr[j]))&&(i!=j)){
					System.out.println("Duplicate element is :"+arr[j]);
				}
			}
		}
	}
}