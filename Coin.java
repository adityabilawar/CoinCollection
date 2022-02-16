package CoinSet;

public class Coin {
	int year;
	String type;
	public Coin() {
		year = 0;
		type = "";
	}
	public Coin(int year, String type) {
		this.year = year;
		this.type = type;
	}
	public void setYear(int year) {
		 this.year = year;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return this.year;
	}
	public String getType() {
		return this.type;
	}
	public String toString() {
		return year + ", " + type;
	}
	public boolean equals(Object o) {
		if(o instanceof Coin)
		if(this.getType().equals(((Coin)o).getType()) && this.year/10 == ((Coin)o).year/10) {
				return true;
		}
		else 
		return false;
		else
		return false;
	}
}