import java.util.Scanner;
class NoOfZeros{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("No of input lines:");
		int test=sc.nextInt();
		for(int i=0;i<test;i++){
			//System.out.println("Enter the input value:");
			int input=sc.nextInt();
			//System.out.println("No of zeros:");
			System.out.println(count(input));
			
		}
		
	}
	public static int count(int input){
		int cnt=0;
		while(input>=5){
			cnt+=input/5;
			input/=5;
		}	
		return cnt;
	} 
}