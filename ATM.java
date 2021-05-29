/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    
		
		Scanner s = new Scanner(System.in);
		int out = s.nextInt();
		double remain = s.nextDouble();
		 
		 if(out+0.50<=remain&&out%5==0)
		 {
               
                remain = remain-out-0.50;
		 }
		 System.out.println(remain);
		}
		catch (Exception e){
		    System.out.println(e);
		}
		
	}
}
