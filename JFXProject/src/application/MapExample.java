package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("Mount Everest", 29029);
		m.put("K2", 28251);
		m.put("Kangchenjunga", 28169);
		m.put("Lhotse", 27940);
		m.put("Makalu", 27838);

		inMap(m, "K2");
		inMap(m, "Manaslu");
		System.out.printf("%nContents:%n");
		for (Entry<String, Integer> e : m.entrySet()) {
			System.out.printf(" %s=%d%n", 
				e.getKey(), e.getValue());
		}
	}
	
	public static <K, V> void inMap(Map<K,V> m, K key) {
//		System.out.printf("%s: %s%n", key, 
//			m.containsKey(key)? m.get(key):"not in map");
		
		
		if (m.containsKey(key)){
			m.get(key);
			System.out.println(key);
		}
		else {
			System.out.println("not in map");
		}
	}



}
