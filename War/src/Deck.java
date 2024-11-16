import java.util.Random;

public class Deck {
	private Card[] cards;
	Random random = new Random();
	public Deck(int i) {
		this.cards = new Card[n];
	}

	public Card[] getCards() {
		return cards;
	}

	public void Deck(Card[] cards) {
		for (Card card : cards) {
			System.out.println(card);
		}
	}
	public Deck subDeck(int low, int high) {
		Deck sub = new Deck(high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public void swap(Card[] cards2, int i, int j) {
		Card temp = cards[i];
	

	}

	public int binarySearch(Card target) {
		int low = 0;
		int high = cards.length - 1;
		while (low <= high) {
			int mid = ((low + high) / 2);
			int comp = cards[mid].compareTo(target);

			if (comp == 0) {
				return mid;
			} else if (comp < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	public void shuffle() {
		for(int i = 0; i < cards.length; i++) {
		int loc = random.nextInt((cards.length - i) + i);
		swap(i, loc);
		}
	}

	public static void sort(Card[] cards) {
		for (int i = 1; i < cards.length; i++) // Insert i'th record
			for (int j = i; (j > 0) && (cards[j].compareTo(cards[j - 1]) < 0); j--)
				swap(cards, j, j - 1);

	}
}