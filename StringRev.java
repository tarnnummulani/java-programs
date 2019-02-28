import java.lang.*;
import java.io.*;
import java.util.*;
class StringRev{
   public static void main(String args[]){
	String str=new Scanner(System.in).nextLine();
	
	/*System.out.println("hi"+" "+str);
	StringBuilder input=new StringBuilder();
	input.append(str);
	input=input.reverse();
	System.out.println("hi"+" "+input);*/

	/*byte[] arr = str.getBytes();
	System.out.println(Arrays.toString(arr));*/

	/*byte[] arr = str.getBytes();
	byte[] result = new byte[arr.length];
	for(int i=0;i<arr.length;i++){
	  result[i]=arr[arr.length-i-1];
	}	
	System.out.println(new String(result));*/

	/*char arr[] = str.toCharArray();
	for(int i=arr.length-1;i>=0;i--){
	  System.out.print(arr[i]);
	}*/
	
	
	char arr[]=str.toCharArray();
	List<Character> trial1 =new ArrayList<>();
        for(char c:arr)
	  trial1.add(c);
	Collections.reverse(trial1);
	ListIterator li = trial1.listIterator(); 
        while (li.hasNext()) 
            System.out.print(li.next()); 
    
  }
}