import java.util.*;
public class Convert
{
    public static void main(String[] args) 
    {
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        /*System.out.print("Enter any decimal number:");
        n = s.nextInt();*/

        /*Decimal to bina
	while(n > 0)
        {
            a = n % 2;
            if(a == 0)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
	char arr[]=x.toCharArray();
	StringBuilder input=new StringBuilder();
	input.append(arr);
	input=input.reverse();
        System.out.println("Binary number is:"+input);
        System.out.println("No. of 2s:"+count);*/


	/* decimal to octal
	while(n > 0)
        {
            a = n % 8;
            if(a == 0)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 8;
        }
	char arr[]=x.toCharArray();
	StringBuilder input=new StringBuilder();
	input.append(arr);
	input=input.reverse();
        System.out.println("Octal number is:"+input);
        System.out.println("No. of 8s:"+count);*/



	/* decimal to hexa
	while(n > 0)
        {
            a = n % 16;
            if(a == 0)
            {
                count++;
            }
	    else if(a==10){
		x=x+""+"A";
	    }
	    else if(a==11){
		x=x+""+"B";
	    }
	    else if(a==12){
		x=x+""+"C";
	    }
	    else if(a==13){
		x=x+""+"D";
	    }
		else if(a==14){
		x=x+""+"E";
	    }
		else if(a==15){
		x=x+""+"F";
	    }else{
            x = x + "" + a;}
            n = n / 16;
        }
	char arr[]=x.toCharArray();
	StringBuilder input=new StringBuilder();
	input.append(arr);
	input=input.reverse();
        System.out.println("Octal number is:"+input);
        System.out.println("No. of 8s:"+count);*/

	/*
	System.out.print("Enter a binary number: ");
       String binaryString =s.nextLine();
       System.out.println("Output: "+Integer.parseInt(binaryString,2));*/
	

	
	System.out.print("Enter a binary number: ");
       int bn =s.nextInt();
	Convert c=new Convert();
	//System.out.println("Output is:"+c.BinaryToDecimal(bn));
	System.out.println("Output is:"+c.BinaryToOctal(bn));
}


	
	public int BinaryToDecimal(int bn){
	int decimal=0;
	int p=0;
	while(true){
	
	if(bn==0){
		break;
	}else{
		int temp;
		temp=bn%10;
		decimal+=temp*Math.pow(2,p);
		bn=bn/10;
		p++;
		
		}
	}
	return decimal;
 }	


	   
}