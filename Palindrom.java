import java.util.Scanner;
public class Palindrom{

     public static void main(String []args){
        int x,n,b=0,rem;
        Scanner sc= new Scanner(System.in);
       System.out.println("enter the number");
       n=sc.nextInt();
       x=n;
       while(n>0)
       {
           rem=n%10;
           b=b*10+rem;
           n=n/10;
       }
        if(x==b)
        {
            System.out.println("plaindrome");
        }
       else
            System.out.println("not palindrome");    
       
}
}