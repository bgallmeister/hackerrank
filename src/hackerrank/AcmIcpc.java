package hackerrank;

import java.util.*;

public class AcmIcpc {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    Map <Integer, Set<Integer>> skills = new HashMap<Integer, Set<Integer>>();

        int n = in.nextInt();
        int m = in.nextInt();
        for(int exp_i=0; exp_i < n; exp_i++){
            String expertise = in.next();
            skills.put(exp_i, new HashSet<Integer>());
            for (int topic=0; topic<m; topic++) {
            	if (expertise.charAt(topic) == '1') {
            		skills.get(exp_i).add(topic);
            	}
        	}
        }
        
		// Yay, O(N**2).  Probably going to have to optimize/reimplement this...
	
        int maxTeamSkills = 0;
        int numWithMaxSkills = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i==j) continue;
				Set<Integer> teamskills = new HashSet<Integer>(skills.get(i));
				teamskills.addAll(skills.get(j));
				if (teamskills.size() > maxTeamSkills) {
					maxTeamSkills = teamskills.size();
					numWithMaxSkills = 1;
				} else if (teamskills.size() == maxTeamSkills) {
					numWithMaxSkills++;
				}
			}
		}
		System.out.println(maxTeamSkills);
		System.out.println(numWithMaxSkills / 2);
	}

}
