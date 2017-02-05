
public class Temps {
	protected Chrono chrono;
	protected int Tour;
	public Temps(Chrono chrono, int tour) {
		super();
		this.chrono = chrono;
		Tour = tour;
	}
	public Chrono getChrono() {
		return chrono;
	}
	public void setChrono(Chrono chrono) {
		this.chrono = chrono;
	}
	public int getTour() {
		return Tour;
	}
	public void setTour(int tour) {
		Tour = tour;
	}
	
}
