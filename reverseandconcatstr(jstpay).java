/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	StringBuilder sb=new StringBuilder();
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String strcpy="";
		for(int i=0;i<str.length();i++)
		{
			strcpy+="-"+str.charAt(i);
		}
		sb.append(strcpy);
		System.out.println(sb.reverse());
	
	}
}
