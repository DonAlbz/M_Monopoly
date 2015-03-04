package Monopoly;

import it.unibs.fp.mylib.InputDati;

	public class Main {
		private static final String NUMERO_GIOCATORI_DOMANDA = "Quanti giocatori giocheranno?";
		private final static int NUMERO_GIOCATORI_MIN = 2;
		private final static int NUMERO_GIOCATORI_MAX = 6;
		private static Gioco game;

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			salutiIniziali();
			inizzializzaGioco();
			gioca();
			
			

		}

		private static void gioca() {
			Boolean continua = true;
			int tiro;
			while (continua){
				tiro = game.tiro();
				System.out.printf("Il risultato del tuo tiro e': %d \n",tiro);
				continua=InputDati.yesOrNo("Vuoi continuare sta cacata?");
			}
			
		}

		private static void inizzializzaGioco() {
			int numeroGiocatori;
			numeroGiocatori=InputDati.leggiIntero(NUMERO_GIOCATORI_DOMANDA, NUMERO_GIOCATORI_MIN,NUMERO_GIOCATORI_MAX);
			game = new Gioco(numeroGiocatori);

			
		}

		private static void salutiIniziali() {
			
		}

	}
