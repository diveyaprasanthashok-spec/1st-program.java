import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int evencount = 0;
		int oddcount = 0;
		for(int i=0;i<N;i++){
		    int wp = sc.nextInt();
		    if(wp%2==0){
		        evencount++;
		    }else{
		        oddcount++;
		    }
		}
	if(evencount>oddcount){
	    System.out.println("READY FOR BATTLE");
	}else{
	    System.out.println("NOT READY");
	}
}
}
