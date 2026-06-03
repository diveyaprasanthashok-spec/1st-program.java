import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0){
		int hd = sc.nextInt();
         double cc = sc.nextDouble();
         int ts = sc.nextInt();

		
		
		if((hd>50) && (cc<0.7) && (ts>5600)){
		    System.out.println("10");
		}else if ((hd>50) && (cc<0.7)){
		    System.out.println("9");
		}else if ((cc<0.7) && (ts>5600)){
		    System.out.println("8");
		}else if ((hd>50) && (ts>5600)){
		    System.out.println("7");
		}else if ((hd>50) || (cc<0.7) || (ts>5600)){
		    System.out.println("6");
		}else {
		    System.out.println("5");
		}

	}
}
}
