package hackerrank;

import java.util.HashMap;
import java.util.HashSet;

import java.util.*;

public class FavoriteSequence {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    SortedSet<Integer> distinct = new TreeSet<Integer>();

	    // I have totally misunderstood this problem.
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            int k = in.nextInt();
            for (int j = 0; j<k; j++) {
            	distinct.add(in.nextInt());
            }
        }
        
        Integer num;
 
        Iterator it = distinct.iterator();
        while (it.hasNext()) {
            // Get element
            Object element = it.next();
            System.out.print(element + " ");
		}
        System.out.println();
	}
}
