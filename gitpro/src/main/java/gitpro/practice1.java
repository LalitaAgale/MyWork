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
		
		int []a= {8,7,6,5,4,3,2,1};
		int k=3;
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+",");
			
		}
		}
	
		}
	




