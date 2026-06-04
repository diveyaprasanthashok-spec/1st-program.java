import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int T = sc.nextInt();
	    while(T-->0){
	        int B = sc.nextInt();
	        int LS = sc.nextInt();
	        
	        double minRs =Math.sqrt (LS*LS - B*B);
	        double maxRs =Math.sqrt (LS*LS + B*B);
	        System.out.printf("%.5f %.5f%n",minRs,maxRs);
	    }
	}
}
