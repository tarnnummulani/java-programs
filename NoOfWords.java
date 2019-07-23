import java.util.Scanner;
public class NoOfWords{
	static final int OUT=0;
	static final int IN=1;
	static int countWords(String a){
		int state=OUT;
		int wc=0;
		int i=0;
		while(i<a.length()){
			if(a.charAt(i)==' '||a.charAt(i)=='\n'||a.charAt(i)=='\t')
				state=OUT;
			else if(state==OUT){
				state=IN;
				++wc;
			}
			++i;
		}
		return wc;
	}
	public static void main(String args[]){
		String a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		System.out.println("NO OF WORDS:"+countWords(a));
	}	
}