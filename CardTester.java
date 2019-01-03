/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Queen", "Hearts", 10);
		Card card2 = new Card("Queen", "Hearts", 10);
		Card card3 = new Card("Queen", "Spades", 256);
		System.out.println(card1.rank() + " " + card1.suit() + " " + card1.pointValue());
		System.out.println(card3.rank() + " " + card3.suit() + " " + card3.pointValue());
		System.out.println(card2.toString());
		System.out.println(card1.matches(card2));
		System.out.println(card2.matches(card3));


	}
}

