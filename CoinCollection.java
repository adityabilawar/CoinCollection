package CoinSet;
import java.util.ArrayList;

public class CoinCollection {
	MySet<Coin> c;
	public CoinCollection() {
		c = new MySet<Coin>();
	}
	public CoinCollection(ArrayList<Coin> a) {
		c = new MySet<Coin>();
		for(int i = 0; i < a.size(); i ++) {
			c.add(a.get(i));
		}
	}
	public String toString() {
		return c.toString();
	}
}