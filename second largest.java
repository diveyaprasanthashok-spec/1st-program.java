import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int[] arr = {A,B,C};
		    Arrays.sort(arr);
		    System.out.println(arr[arr.length-2]);
		    
		}

	}
}
