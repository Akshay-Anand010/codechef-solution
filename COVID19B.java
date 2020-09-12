/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner in=new Scanner(System.in);
    int T=in.nextInt();
    for(int p=0;p<T;p++)
    {
    int n=in.nextInt();
    int v[]=new int[n];
    for(int i=0;i<n;i++)
    v[i]=in.nextInt();
    int min=1;
    int max=1;
    int res[][]=new int[10][n];
    for(int i=0;i<50;i++){
      for(int j=0;j<n;j++){
        res[i][j]=(j+1)+v[j]*i;
        int a=0;
        int c[]=new int[n];
        while(a<n){
          c[a]=res[i][a]==res[i];
          a++;
        }
        for(int p1=0;p1<n;p1++)
        {
          for(int p2=p1;p2<n;p2++)
        {
          if(c[p1]==c[p2])
            max++;
        } 
        }
      }
    }
    System.out.println(max);
    }
	}
}
