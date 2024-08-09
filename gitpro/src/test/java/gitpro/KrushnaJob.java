package gitpro;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class KrushnaJob {
public static void main(String[] args) {
	String str="my name is lalita";
	String rev="";
	String[]arr=str.split(" ");
	for(int i=arr.length-1;i>=0;i--) {
		rev=rev+arr[i]+" ";
	}
	System.out.println(rev);
	
	String s="lalital";
	char[]ar=s.toCharArray();
	HashMap<Character,Integer>map=new HashMap<>();
	for(Character c:ar) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}
		else {
			map.put(c, 1);
		}
	}
	System.out.println(map);
	int max=0;
	char mac=' ';
	for(Entry<Character, Integer> map1:map.entrySet()) {
		if(max<map1.getValue()) {
			max=map1.getValue();
			mac=map1.getKey();
		}
	}
	System.out.println(mac+" "+max);
	int vowels=0;
	int consonants=0;
	String one="helloenious";
	StringBuilder sb=new StringBuilder();
	StringBuilder ss=new StringBuilder();
	for(char b:one.toCharArray()) {
		if(b>'a'&&b<'z') {
			if(b=='a'||b=='a'||b=='e'||b=='o'||b=='u') {
				sb.append(b);
				vowels++;
			}
			else {
				ss.append(b);
				consonants++;
			}}}
	System.out.println("vowels are:"+vowels+"-"+sb+", ");
	System.out.println("consonants are:"+consonants+"-"+ss+",");
	
	
	String az="aabbccdde";
	Set<String>set=new LinkedHashSet<>();
	StringBuilder sb1=new StringBuilder();
	for( int i=0;i<az.length()-1;i++) {
		
		
	}
	
	
	
	
}
}
