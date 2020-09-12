import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int p1=0;p1<t;p1++)
        {
        int n=in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
            a[i][j]=in.nextInt();
            }
        }
        int p[]=new int[n];
        for(int i=0;i<n;i++)
        p[i]=a[0][i];
        int o[]=new int[n];
        for(int i=0;i<n;i++)
        o[i]=i+1;
        int flag=0;
        int c=0;
        if(Arrays.equals(p,o)){
           c=n; 
        }
        else{
        for(int i=n-1;i>=0;i--){
         if(p[i]==o[i]){
             if(i+1>flag)
             flag=i+1;
             
         }
        } 
        }
        if(c==n)
        System.out.println(0);
        else
        System.out.println(flag);
        }
	}
}
