import java.util.Scanner;

class GetPrimeNo2{
	public static void main(String args[]){
		int a,b,flag;
		Scanner in=new Scanner(System.in);
		System.out.println("Staring  No. of range");
		a=in.nextInt();
		System.out.println("Ending  No. of range");
		b=in.nextInt();
		for(int i=a;i<=b;i++){
			if(i==1){
				continue;
			}
			flag=1;
			for(int j=2;j<=i/2;j++){
				if(i%j==0&i!=j){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.print(i+" ");
			}
		}
	}
}