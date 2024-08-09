package gitpro;

import java.util.LinkedHashSet;
import java.util.Set;

public class practice1 {

	public static void main(String[] args) {
		String str="llaahhttfb";
		int s=str.length();
		Set<Character>set=new LinkedHashSet<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=s-1;i++) {
			set.add(str.charAt(i));
				
			}
		for(Character c:set) {
			sb.append(c);
		}
		System.out.println(sb);
		}
	}




