package Monopoly;

import it.unibs.fp.mylib.NumeriCasuali;



public class Dado {
	private final int VALORE_MIN_DADO=1;
	private final int VALORE_MAX_DADO=6;
	
	/**Costruisce un dado con valore massimo indicato dal parametro {@link #valoreMaxDado}
	 * @param valoreMaxDado indica quale e' il valore massimo che puo' assumere un dado.
	 */
	public Dado(){
		
	}

	/**Fornisce il risultato del tiro del dado.
	 * @return un valore casuale tra {@link #VALORE_MIN_DADO} e {@link #valoreMaxDado}
	 */
	public int tiro() {
		int tiro;
		tiro = NumeriCasuali.estraiIntero(VALORE_MIN_DADO, VALORE_MAX_DADO);
		return tiro;
	}
		
}


