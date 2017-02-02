package hackerrank;
import java.util.*;
import java.io.*;

public class EqualArray {
    public static void main(String []argh) {

	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    Map <Integer, Integer> counts = new HashMap<Integer, Integer>();
	    
	    for(int i=0; i < n; i++){
	    	Integer count;
	    	Integer v = in.nextInt();
	        if ((count = counts.get(v)) == null) {
	        	counts.put(v,  1);
	        } else {
	        	counts.put(v,  count+1);
	        }
	    }
	    
	    int maxnum = 0;
	    for (Integer val: counts.keySet()) {
	    	Integer m;
			if ((m = counts.get(val)) > maxnum) {
	    		maxnum = m;
	    	}
	    }
	    
	    System.out.println(n - maxnum);
    }
}
