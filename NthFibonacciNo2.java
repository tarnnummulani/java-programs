import java.util.Scanner;
class NthFibonacciNo2{
	static int fib(int n){
		int i;
		int f[]= new int[n+1];
		f[0]=0;
		f[1]=1;
		for(i=2;i<=n;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}
	public static void main(String args[]){
		int n;
		System.out.println("Enter ur number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(fib(n));
	}
}