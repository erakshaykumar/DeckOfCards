/*@Purpose : Write a Program to initialise deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace").
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players.
 * 1. Ability to work with GIT
 * 2. Expected to have OOPs
 * 3. Expected to have Data Structures
 * UC1 : Setup the initial game with deck of cards and make sure we have unique cards,
 * The number of cards are 52. Should be able to make unique deck. Maintain the ranks to further compare
 */
package deckofcards;

public class DeckOfCardsMain {
	/*
	 * @Purpose : For Calling Welcome Method, Deck Of Cards Method
	 */
	public static void main(String[] args) {
		DeckOfCards deckOfCardsGame = new DeckOfCards();
		deckOfCardsGame.welcome();
		deckOfCardsGame.deckOfCards();
	}
}
