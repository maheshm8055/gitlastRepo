package com.pack3.general;

public class StringReverse {
	
	String original = "madam";
	
	String revers_String ;
	
	public void StringReverseStringBuffer() 
	{
		StringBuffer sb = new StringBuffer(original);
		sb.reverse();
		System.out.println(sb);
		if (sb.equals(original)) {
			System.out.println( "equal strings " );	
			
		}
		else
		System.out.println("not equal strings" );	
	} 
	public void StringReverseCharAt() 
	{
	
		String revers_2 = "";
		 char[] chatarray1 = original.toCharArray();
			int lenth = chatarray1.length;
			System.out.print("by using to char array"+"\n");
			for(int i = lenth-1 ; i>=0 ; i--) 
			{
				System.out.print(chatarray1[i]);
			}
			
			System.out.println("\n");
			int lenth_2 = original.length();
			System.out.print("by using to charAt[]"+"\n");
			for(int i = lenth_2-1 ; i>=0 ; i--) 
			{
				System.out.print(original.charAt(i));
				revers_2 =revers_2+ original.charAt(i);
			}
			
			System.out.println("++++++++++++"+revers_2);
			System.out.println(original +"  "+revers_2);

			if (original.equals(revers_2))            //.equals()is used compare the 2 strings equal or not 

			{
				System.out.println("given string is palindrom");

			} else {

				System.out.println("given string is not a palindrom");

			}
		
	}
	
	public static void main(String[] args ) {
		
		StringReverse stringReverse = new StringReverse();
		//stringReverse.StringReverseStringBuffer();
		stringReverse.StringReverseCharAt();
		
		
	}

}
