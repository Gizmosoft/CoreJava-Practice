package com.tech.ninzaz;

public class Duplicate 
{
	public static void main(String[] args)
	{
		String s[]={"Java","JSP","Struts","Java","JDBC", "JSP"};
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
					System.out.println(s[i]);
			}
		}
	}

}
