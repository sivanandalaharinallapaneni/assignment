import java.util.*;
import java.io.*;
import java.lang.*;

public class Treemapfrequency12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your input:");
		String str=s.nextLine();
		Map<Character,Integer> mp= new TreeMap<Character,Integer>();
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)!=' ') {
				int c=0;
				for(int j=0;j<str.length();j++)
					if(str.charAt(i)==str.charAt(j))
						c++;
				mp.put(str.charAt(i),c );
				
			}
		}
		
		for(Map.Entry<Character, Integer>x:mp.entrySet()) {
			int num=x.getValue();
			System.out.print(x.getKey()+":");
for(int i=0;i<num;i++)
				System.out.print("*");
			System.out.println();
		}

	}

}

