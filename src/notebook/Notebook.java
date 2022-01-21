package notebook;

import java.util.Comparator;

public class Notebook implements Comparable<Notebook>{

	private int price;
	private int memory;
	private Vendor vendor;

	public Notebook(int price, int memory, Vendor vendor) {
		setPrice(price);
		setMemory(memory);
		setVendor(vendor);
	}

	public int getPrice() {
		return price;
	}

	public int getSteepPrice() {
		return price / 50;
	}

	public int getSteepMemory() {
		return memory / 4;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "NB:" + getVendor().name +", " +
				+ memory + ", " +
				+ price;
	}

	@Override
	public int compareTo(Notebook n) {
		return Comparator
				.comparingInt(Notebook::getSteepPrice)
				.thenComparingInt(Notebook::getSteepMemory)
			    .thenComparing(Notebook::getVendor)
				.compare(this,n);


	}
}
