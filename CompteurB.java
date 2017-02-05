
public class CompteurB extends Compteur{
	private int Max;
	private int Min;
	public CompteurB(int max, int min) {
		super();
		Max = max;
		Min = min;
	}
	public int getMax() {
		return Max;
	}
	public void setMax(int max) {
		Max = max;
	}
	public int getMin() {
		return Min;
	}
	public void setMin(int min) {
		Min = min;
	}
}
