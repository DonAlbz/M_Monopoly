package Monopoly;

import it.unibs.fp.mylib.InputDati;

public class Gioco {
	private static final String NUMERO_GIOCATORI_DOMANDA = "Quanti giocatori giocheranno?";
	private final static String CIAO = "Ciao Mona";
	private final static String DADI_UGUALI="Hai ottenuto due dadi dal valore di %d\n";
	private final static String RILANCIARE= "Vuoi rilanciare?";
	private final static String DIVISORE= "=====================================";
	private final static int NUMERO_GIOCATORI_MIN = 2;
	private final static int NUMERO_GIOCATORI_MAX = 6;
	
	private final int NUMERO_DADI=2;
	
	
	private int numeroGiocatori;
	private Dado[] dado;
	private static ElencoGiocatori elencoGiocatori= new ElencoGiocatori();
	
	public Gioco(int numeroGiocatori){
		
		numeroGiocatori=elencoGiocatori.quantiGiocatori();
		creaDadi();
		creaGiocatori();
	}
	
	
	/**Crea un numero di dadi pari a {@link #NUMERO_DADI} e di valore max pari a {@link #VALORE_MAX_DADI} 
	 */
	public void creaDadi(){
		dado = new Dado[NUMERO_DADI];
		for(int i = 0 ; i < NUMERO_DADI; i++)
			dado[i] = new Dado();
	}
	
	//TODO:Sistemare array utilizzando classe ElencoGiocatori e implementare richiesta nome ogni volta che crea un giocatore
	
	private final static String RICHIESTA_NOME= "Nome: ";
	private String nome;
	
	public void creaGiocatori(){
		
		for (int i = 0; i < numeroGiocatori; i++) {
			nome=InputDati.leggiStringa(RICHIESTA_NOME);
			Giocatore nuovo= new Giocatore(nome);
			elencoGiocatori.aggiungiGiocatore(nuovo); 
			
		}
			
			
		}

	public int getNumeroGiocatori(){
		return this.numeroGiocatori;
	}
			
		
	/**Fornisce il risultato del tiro dei dadi.
	 * @return risultato del tiro
	 * @see Dado#tiro()
	 */
	public int tiro(){
		int risultato = 0;
		for(int i=0;i<NUMERO_DADI;i++)
		risultato = dado[i].tiro();
		return risultato;
	}
	


	private void inizializzaGioco() {
		int numeroGiocatori;
		numeroGiocatori=InputDati.leggiIntero(NUMERO_GIOCATORI_DOMANDA, NUMERO_GIOCATORI_MIN,NUMERO_GIOCATORI_MAX);
		Gioco gioco = new Gioco(numeroGiocatori);
		gioco.getNumeroGiocatori();
		
		Boolean continua = true;
		Boolean rilancio= false;
		int tiroUno, tiroDue, totale;
		
		
	while (continua){
		for (int i=1; i<numeroGiocatori+1; i++) {
			tiroUno = this.tiro();
			tiroDue = this.tiro();
			totale=tiroUno+tiroDue;
			if(tiroUno==tiroDue) {
				System.out.printf(DADI_UGUALI,tiroUno);
				rilancio=InputDati.yesOrNo(RILANCIARE);
					if(rilancio) {
						tiroUno = this.tiro();
						tiroDue = this.tiro();
					}
			}
			System.out.printf("Giocatore %d primo tiro e': %d \n",i,tiroUno);
			System.out.printf("Giocatore %d secondo tiro e': %d \n",i,tiroDue);
			System.out.printf("Giocatore %d avanza di %d caselle\n",i,totale);
			System.out.println(DIVISORE);
				
			continua=InputDati.yesOrNo("Vuoi continuare sta cacata?");
			
		}
			
	}
		
		
		
	}

	private void salutiIniziali() {
		System.out.println(CIAO);
	}

	public void iniziaGioco() {
		salutiIniziali();
		
		inizializzaGioco();
		
	}
	
	

}
