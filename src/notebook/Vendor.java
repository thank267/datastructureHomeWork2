package notebook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public enum Vendor implements Comparator<Vendor> {

	XAMIOU(1, "Xamiou"),
	ESER(2, "Eser"),
	MACNOTE(3, "MacNote"),
	ASOS(4, "Asos"),
	LENUVO(5, "Lenuvo");

	int weight;
	String name;
	Vendor(int w, String n ) {
		weight = w;
		name = n;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public static Vendor valueOf(int weight) {
		return Arrays.stream(values())
				.filter(v -> v.getWeight() == weight)
				.findFirst().get();
	}

	@Override
	public int compare(Vendor o1, Vendor o2) {
		return o1.getWeight() - o2.getWeight();
	}
}
