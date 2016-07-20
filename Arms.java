# arms1
import java.util.Scanner;
public class Arms {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=n;
		int b=0;
		  while(n!=0)
		 {
			 int a =n%10;
			 int k =a*a*a;
			  b =k+b;
			 n=n/10;}
		 System.out.println(b);
		  if(b==j){
			 System.out.println("the given number is armstrong");
		 }
		 else{
			 System.out.println("the given number is not armstrong");
		 }
}
}

