
package hackerrank;

import java.util.*;

public class Day6Review {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int maxdist=0;
        for (int i=0; i<m-1; i++) {
        	if (maxdist < (c[i+1] - c[i])/2)
        		maxdist = (c[i+1] - c[i])/2;
        }
        if (maxdist < c[0])
        	maxdist = c[0];
        if (maxdist < (n-1) - c[m-1])
        	maxdist = (n-1) - c[m-1];
        System.out.println(maxdist);
    }

}
