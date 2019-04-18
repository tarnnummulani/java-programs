import java.util.ArrayList;
import java.util.Scanner;

public class GetPrimeNumbers{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number from which you want prime number: ");
		int p1 = in.nextInt();
		System.out.println("Enter one more number till which you want prime number: ");
		int p2 = in.nextInt();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int i=2;
		for(int p=p1; p<=p2; p++){
	
			for(i=2; i<10; i++){
				if(p%i==0 && p!=i){
				break;
				}	
			}
		    if(i==10){
			prime.add(p);
			}
		
		}
		System.out.println("Prime numbers between "+p1+" and "+p2+" are: ");
		for(int j=0; j<prime.size(); j++){
		System.out.print(prime.get(j).toString()+" ");
		}
}
}