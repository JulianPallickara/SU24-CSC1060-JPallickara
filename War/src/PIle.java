import java.util.ArrayList;

public class PIle {
	private ArrayList<Card> cards;

	public PIle(ArrayList<Card> cards) {
		this.cards = new ArrayList<Card>();
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public Card popCard() {
		return this.cards.remove(0);
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public void addDeck(Deck deck) {
		for(Card card : deck.getCards());
	}
}
