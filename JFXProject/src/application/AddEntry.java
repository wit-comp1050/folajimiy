package application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AddEntry {
	public static void p(Map<?,? extends Number> m) {
		for (Entry<?, ? extends Number> e : m.entrySet()) {
			System.out.printf("%s=%.2f%n", e.getKey(), e.getValue().doubleValue());
		}
		System.out.printf("%n");
	}

	public static <K> void inc(Map<K, ? super Double> m, double amt) {
		for (K k : m.keySet()) {
			m.replace(k, (double) m.get(k) + amt);
		}
	}

	public static void main(String[] args) {
		Map<String, Double> m = new LinkedHashMap<>();

		m.put("Booger", 1.);
		m.put("Rotten Egg", 1.5);
		m.put("Vomit", 1.);
		m.put("Cherry", 2.);

		p(m);	
		inc(m, 0.5);
		p(m);	
	}

}
