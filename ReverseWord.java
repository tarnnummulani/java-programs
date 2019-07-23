public class ReverseWord{
	public static void main(String args[]){
		String str[]="I love java programming".split(" ");
		String revstr="";
		for(int i=str.length-1;i>=0;i--){
			revstr+=str[i]+" ";
		}
		System.out.println("Reversed string is: "+revstr);
	}
}