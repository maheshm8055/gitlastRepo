package com.pack2.practize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindingDublicates 
  {
	public static void main(String[] args) 
	{
			List<String> lst1 = new ArrayList<String>();
			Map<Character, Integer> hm = new HashMap<>();
			Map<String, Integer> hm2 = new HashMap<>();
			FindduplicateCharecters fdc = new FindduplicateCharecters();
			lst1.add("srinivas");
			lst1.add("mahesh");
			lst1.add("brahmaji");
			lst1.add("appllicable");
			lst1.add("manegerial efforts");
			
			
			System.out.println(lst1);
			for (String str : lst1) {
				int len = str.length();
				
				
				for (int i = 0; i < len; i++) {
					if (i < 0) {
						continue;
					}
					Character c = str.charAt(i);

					if (hm.containsKey(c)) {
						hm.put(c, hm.get(c) + 1);
					} else {
						hm.put(c, 1);
					}

				}
				System.out.println("\n" + "+++++++++++++++++++++++");
				System.out.println(str);
				System.out.println("number of charecters in this string is " + len);
				for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
					System.out.println("letter===>" + entry.getKey() + "---> count --->" + entry.getValue());

				}
				// for  finding duplicate keys or string 
				
				hm.clear();
				if (hm2.containsKey(str)) {
					hm2.put(str, hm.get(str) + 1);
				} else {
					hm2.put(str, 1);
				}
				
			}
			
			for(Map.Entry<String, Integer> entry2 :hm2.entrySet()) {
				System.out.println("+++++++++++++++++++++++list out dublicates+++++++++++++++++++");
				System.out.println("strings----->"+entry2.getKey()+"----number of dublicate  strings +++>"+entry2.getValue());
			}
		}

	}

