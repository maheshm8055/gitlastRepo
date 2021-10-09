package Streems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main
{
	// Program to transform HashMap<String, String> into HashMap<String, Integer>
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();

		map.put("One", "1");
		map.put("Two", "2");
		map.put("Three", "31");

		Map<String, Integer> hashMap =
				map.entrySet().stream().collect(Collectors.toMap(
									entry -> entry.getKey(),
									entry -> Integer.parseInt(entry.getValue()))
								);

		System.out.println(hashMap);
	}
}