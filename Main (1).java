// Main.java
import java.util.*;
class Main{
	public static void main(String[] args){
		Deck deck = new Deck();
		System.out.println("Creating Deck..");
		deck.createDeck();
		System.out.println("Deck created.");
		deck.displayDeck();
		System.out.println("Shuffling Deck..");
		System.out.println("Displaying shuffled deck");
		deck.shuffleDeck();
		deck.displayDeck();
	}
}