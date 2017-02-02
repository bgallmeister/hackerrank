package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CloudGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int steps = 0;
        int position = 0;
        while (position != (n-1)) {
        	if (position+2 > (n-1))
        		position = n-1;
        	else
        		position = position+2;
        	if (c[position] == 1)
        		position--;
        	if (c[position] == 1) {
        		// error, should not happen
        		System.out.println("error at position " + position);
        	}
        	steps++;
        }
        System.out.println(steps);
    }

}
