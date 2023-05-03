package org.sample;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Baseprogram {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
	       int evens=0;
	       for(int num:a){
	           if(num%2==0){
	               evens++;
	           }
	       }
	       int o =0,e=0;
	       int odd[] = new int[a.length-evens];
	       int even[] = new int [evens];
	       for(int i =0; i<a.length;i++){
	       if(a[i]%2==0){
	           odd[o]=a[i];
	           o++;
	       }else{
	           even[e]=a[i];
	           e++;
	       }
	    }
	        System.out.println(Arrays.toString(odd));
	          System.out.println(Arrays.toString(even));

	}
}
