package Monopoly;

import java.util.Vector;

public class ElencoGiocatori {
	
	public Vector <Giocatore> tuttiGiocatori;

	public ElencoGiocatori() {
		tuttiGiocatori= new Vector <Giocatore>();
		}
	
	public void aggiungiGiocatore(Giocatore nuovo){
		tuttiGiocatori.add(nuovo);
	}
	
	public int quantiGiocatori (){
		return tuttiGiocatori.size();
	}
	
	 public boolean presente (String nomeGiocatore)
	 {
		 for (Giocatore partecipante : tuttiGiocatori)
		 {
			 if (nomeGiocatore.equalsIgnoreCase(partecipante.getNome()))
				return true;
		 }
		 return false;
	 }

}
