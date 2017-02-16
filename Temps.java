
public class Temps {
	private CompteurCycl hour = new CompteurCycl(23, 0);
	private CompteurCycl minute = new CompteurCycl(59, 0);
	private CompteurCycl second = new CompteurCycl(59, 0);
	private int Tour=0;
	public Temps(int tour) {
		Tour = tour;
	}
	public int getTour() {
		return Tour;
	}
	public void increment() {
		second.increment();
		if (second.getValeur() == 0) {
			minute.increment();
			if (minute.getValeur() == 0) {
				hour.increment();
				if(hour.getValeur()==0)	{
					++Tour;
				}
			}
		}

	}

	public void decrement() {
		second.decrement();
		if (second.getValeur() == 59) {
			minute.decrement();
			if (minute.getValeur() == 59) {
				hour.decrement();
				if(hour.getValeur() == 59) {
					--Tour;
				}
			}
		}
	}

	public CompteurCycl getHour() {
		return hour;
	}

	public CompteurCycl getMinute() {
		return minute;
	}

	public CompteurCycl getSecond() {
		return second;
	}

	public String toString() {
		return hour.toString() + " : " + minute.toString() + " : " + second.toString();
	}

	public static String transform(int value) {
		String result = "";
		if (value < 10) {
			result = "0" + value;
		} else {
			result = String.valueOf(value);
		}
		return result;
	}

	public void init() {
		hour.setValeur(0);
		minute.setValeur(0);
		second.setValeur(0);
	}
}
