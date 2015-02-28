package Monopoly;

import it.unibs.fp.mylib.NumeriCasuali;



public class Dado {
	private final int VALORE_MIN_DADO=1;
	private int valoreMaxDado;
	
	/**Costruisce un dado con valore massimo indicato dal parametro {@link #valoreMaxDado}
	 * @param valoreMaxDado indica quale e' il valore massimo che puo' assumere un dado.
	 */
	public Dado(int valoreMaxDado){
		this.valoreMaxDado=valoreMaxDado;
	}

	/**Fornisce il risultato del tiro del dado.
	 * @return un valore casuale tra {@link #VALORE_MIN_DADO} e {@link #valoreMaxDado}
	 */
	public int tiro() {
		int tiro;
		tiro = NumeriCasuali.estraiIntero(VALORE_MIN_DADO, valoreMaxDado);
		return tiro;
	}
		
}


