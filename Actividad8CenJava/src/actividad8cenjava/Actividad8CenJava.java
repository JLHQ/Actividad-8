package actividad8cenjava;

/**
 * @author Luis_
 */
public class Actividad8CenJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se creo el mazo");
        Deck deck = new Deck();
        System.out.println("Se barajea el mazo");
        deck.shuffleDeck();
        System.out.println("Se muestra la primera carta del mazo");
        deck.drawHead();
        System.out.println("Se muestra una carta al azar");
        deck.drawRandomCard();
        System.out.println("Se entrega una mano del mazo");
        deck.drawHand();
    }
    
}
