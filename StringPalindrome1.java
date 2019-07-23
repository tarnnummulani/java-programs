import java.util.Scanner;
public class StringPalindrome1{
	public static void main(String args[]){
		String a,b="";
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		for(int i=a.length()-1;i>=0;i--){
			b+=a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)){
			System.out.println("The string is palindrome");
		}
		else{
			System.out.println("The string is not palindrome");
		}
	}
}