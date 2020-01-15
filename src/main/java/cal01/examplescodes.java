package cal01;

import java.util.ArrayList;
import java.util.Scanner;

public class examplescodes {

	public static void main(String[] args) {
		String s= "*#1234";
//		int result = Integer.parseInt(xyz);	
		
		Scanner fi = new Scanner(s);
	    //anything other than alphanumberic characters, 
	    //comma, dot or negative sign is skipped
	    fi.useDelimiter("[^\\p{Alnum},\\.-]"); 
	    while (true) {
	        if (fi.hasNextInt()) 
	        {    int n=0;
	        n=fi.nextInt();
	        Integer iI = new Integer(n);
	        String s1 = Integer.toString(iI); 
	       int[] intArray = new int[4]; 
	       for(int i=0; i<4; i++){
	           intArray[i] = Character.getNumericValue(s1.charAt(i));
	           }
	       int n1=intArray[0];
	       int n2=intArray[1];
	       int n3=intArray[2];
	       int n4=intArray[3];
	       System.out.println(n1);
	       System.out.println(n2);
	       System.out.println(n3);
	       System.out.println(n4); 
	       
	     
	        }       
	        else if (fi.hasNext())
	            fi.next();
	        else
	            break;
	        
	    }
	    
	    

	}

}
