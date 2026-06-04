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
		      int N = sc.nextInt();
		      int K = sc.nextInt();
		      int count = 0;
		      for(int i=0;i<N;i++){
		          int charvalue = sc.nextInt();
		          if((charvalue+K)%7==0){
		              count++;
		          }
		          
		      }System.out.println(count);
		  }

	}
}
