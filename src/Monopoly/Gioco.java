package Monopoly;

public class Gioco {
	private final int NUMERO_DADI=2;
	private final int VALORE_MAX_DADI=6;
	
	private int numeroGiocatori;
	private Giocatore [] giocatore;
	private Dado[] dado;
	
	public Gioco(int numeroGiocatori){
		this.numeroGiocatori=numeroGiocatori;
		creaDadi();
		creaGiocatori();
		
	}
	
	
	/**Crea un numero di dadi pari a {@link #NUMERO_DADI} e di valore max pari a {@link #VALORE_MAX_DADI} 
	 */
	public void creaDadi(){
		dado = new Dado[NUMERO_DADI];
		for(int i = 0 ; i < NUMERO_DADI; i++)
			dado[i] = new Dado(VALORE_MAX_DADI);
	}
	
	
	public void creaGiocatori(){
		giocatore = new Giocatore [numeroGiocatori];
		for (int i = 0; i < numeroGiocatori; i++)
			giocatore[i]=new Giocatore ("Giocatore " + i+1);
		}
			
		
	/**Fornisce il risultato del tiro dei dadi.
	 * @return risultato del tiro
	 * @see Dado#tiro()
	 */
	public int tiro(){
		int risultato = 0;
		for(int i=0;i<NUMERO_DADI;i++)
		risultato += dado[i].tiro();
		return risultato;
	}

}
