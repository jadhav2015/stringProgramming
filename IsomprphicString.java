package com.string.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomprphicString {

	
	public boolean isIsomprphicString(String str1,String str2)
	{
		
		Map<Character,Character> characterMap=new HashMap<Character,Character>();
		Set<Character> charSet=new HashSet<Character>();
		
		 if(str1.length()!=str2.length())
		 return false;
		
		 for(int i=0;i< str2.length();i++)
		 {
			 char s1=str1.charAt(i) ,s2= str2.charAt(i);
			 
			 // if character is already occured
			 if(characterMap.containsKey(s1))
			 {
				 if(characterMap.get(s1)!=s2)
				 return false;
			 }
			 // if character first time occur
			 else
			 {
				if( charSet.contains(s2))
					return false;
				characterMap.put(s1, s2);
				charSet.add(s2);
				 
			 }
		 }
		
		return true;
	}
	
	public static void main(String[] args) {
		
		
		String str1="badc";
		String str2="baka";
		
		IsomprphicString  obj=new IsomprphicString();
		if(obj.isIsomprphicString(str1, str2)==true)
		{
			System.out.println(str1 +"and "+str2+"isomprphic");
		}
		else
		{
			System.out.println(str1 +"and "+str2+"not isomprphic ");
		}
		
	}
}
