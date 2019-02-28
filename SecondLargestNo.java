import java.util.*;
public class SecondLargestNo{
  public static void largest(int n1, int n2,int n3){
   if(n1>n2&n1>n3){
    if(n2>n3){
    /*  ----n1 is greatest number.----*/
    System.out.println(n2+" is second greatest number");
    }else{
    System.out.println(n3+" is second greatest number");
    }
   }else if(n2>n1&n2>n3){
    /*  ----n2 is greatest number.----*/
    if(n1>n3){
    System.out.println(n1+" is second greatest number");
    }else{
    System.out.println(n3+" is second greatest number");
    }
   }
   else{
    /*  ----n3 is greatest number.----*/
   if(n2>n1){
    System.out.println(n2+" is second greatest number");
    }else{
    System.out.println(n1+" is second greatest number");
    }
   
   }
    
  }
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first no:");
   int n1 = sc.nextInt();
   System.out.println("Enter the second no:");
   int n2 = sc.nextInt();
   System.out.println("Enter the third no:");
   int n3 = sc.nextInt();
   largest(n1,n2,n3);
   
  }
}
