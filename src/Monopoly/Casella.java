package Monopoly;

public abstract class Casella {
	
	public String nomeCasella;

	public Casella(String nomeCasella) {
		
		this.nomeCasella= nomeCasella;
		
	}
	
	public String getName() {
		return nomeCasella;
	}

}
