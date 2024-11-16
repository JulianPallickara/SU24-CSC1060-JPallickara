
public class WarDriver {

	public static void main(String[] args) {
		Deck deck = new Deck(0);
		deck.shuffle();
	
		PIle p1 = new PIle();
		p1.addDeck(deck.subDeck(0,25));
		pile p1Win = new PIle();
		PIle p2 = new Pile();
		p2.addDeck(26, 51));
		pile p2Win 
		
		
		mid.addCar
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2  = p2.popCard();
			
			int diff = c1.getRank() - c2.getRank();
			if(diff > 0) {
				p1.addCard(c1);
				p1.addCard(c2);
			}else if (diff < 0) {
				p2.addCard(c1);
				p2.addCard(c2);
			}else {
				tie.addCard(c1);
			}
		}
	}
} 