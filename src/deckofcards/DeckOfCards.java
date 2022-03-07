/*@Purpose : Write a Program to initialise deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace").
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players.
 * 1. Ability to work with GIT
 * 2. Expected to have OOPs
 * 3. Expected to have Data Structures
 * UC1 : Setup the initial game with deck of cards and make sure we have unique cards,
 * The number of cards are 52. Should be able to make unique deck. Maintain the ranks to further compare
 *@File : Deck Of Cards
 *@Author : Akshay Kumar
 */
package deckofcards;

import java.util.ArrayList;

public class DeckOfCards {
	/*
	 * @Purpose : Arraylists Of Cards
	 */
	public ArrayList<String> cardsDeck = new ArrayList<>();

	/*
	 * @Purpose : To Initialise with Welcome Message
	 */
	public void welcome() {
		System.out.println("Welcome to the gaming world of Deck of Cards");
	}

	/*
	 * @Purpose : To Initialise The 52 Cards With Ranks And Suits
	 */
	public void deckOfCards() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck:" + numOfCards);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cardsDeck.add(ranks[i] + "--->" + suits[j]);
			}
		}
		toDisplay(cardsDeck);
	}

	/*
	 * @Purpose : To Display The Deck Of Cards In ArrayList Element
	 */
	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}
}
