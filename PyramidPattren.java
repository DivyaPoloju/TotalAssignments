package com.divya.pyramid;

public class PyramidPattren {

    
	public static void main(String args[])   
	{    
	//i for rows and j for columns      
	
	   int i, j, row = 6;       
	//Outer loop work for rows  
	   for (i=1; i<row; i++)   
	{  
      
	   for (j=row-i; j>1; j--)   
	{  

	System.out.print(" ");   
	}   
	//inner loop for columns  
	for (j=0; j<=i; j++ )   
	{   
	//prints star      
	//System.out.print("* ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
	}   
	}  

