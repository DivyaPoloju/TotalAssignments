package com.divya.demo;

import java.util.HashMap;
import java.util.Map;

public class SquaresOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[] {1,2,3,4,5,6};
       System.out.println(Squares(arr));
	}
	
	private static Map Squares(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{ 
			int key=arr[i];
			int value=key*key;
			map.put(key, value);
		}
		return map;
	}

}
