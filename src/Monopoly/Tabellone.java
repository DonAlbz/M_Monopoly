package Monopoly;

public class Tabellone {

	final private Casella casella [];
	final private int dim;
	
	public Tabellone(int dim) {
		
		this.dim=dim;
		this.casella= new Casella [dim];
	}
	
	public Casella getCasella (int posizione) {
		return casella[posizione];
	}
	
	public void addCasella(Casella c, int posizione) {
		c=casella[posizione];
	}


}
