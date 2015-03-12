public class Testing
{
    public static void main (String[] args)
    {
	Card c = new Card ();
	c.number = 2;
	c.suit = 0;

	Card[] deck = new Card [52];
	resetDeck (deck);
	shuffle (deck);

	for (int i = 0 ; i < deck.length ; i++)
	{
	    System.out.println (deck [i].name ());
	}
    }


    public static void resetDeck (Card[] deck)
    {
	//declaring and instantiating the deck
	for (int i = 0 ; i < 13 ; i++)
	{
	    deck [i] = new Card ();
	    deck [i].number = i + 1;
	    deck [i].suit = 0;
	    deck [i].ownedByPlayer = 0;
	    //System.out.println (deck [i].name ());
	}
	for (int i = 0 ; i < 13 ; i++)
	{
	    deck [i + 13] = new Card ();
	    deck [i + 13].number = i + 1;
	    deck [i + 13].suit = 1;
	    deck [i + 13].ownedByPlayer = 0;
	    //System.out.println (deck [i + 13].name ());
	}
	for (int i = 0 ; i < 13 ; i++)
	{
	    deck [i + 26] = new Card ();
	    deck [i + 26].number = i + 1;
	    deck [i + 26].suit = 2;
	    deck [i + 26].ownedByPlayer = 0;
	    //System.out.println (deck [i + 26].name ());
	}
	for (int i = 0 ; i < 13 ; i++)
	{
	    deck [i + 39] = new Card ();
	    deck [i + 39].number = i + 1;
	    deck [i + 39].suit = 3;
	    deck [i + 39].ownedByPlayer = 0;
	    //System.out.println (deck [i + 39].name ());
	}
    }


    public static void printCards (Card[] hand)
    {
	for (int i = 0 ; i < hand.length ; i++)
	{
	    System.out.print (hand [i].name ());
	}
    }


    public static void collect (Card[] pile)
    {
	for (int i = 0 ; i < pile.length ; i++)
	{
	    pile [i].ownedByPlayer = 0;
	}
    }


    public static void shuffle (Card[] pile)
    {
	for (int i = 0 ; i < 0.75 * pile.length ; i++)
	{
	    for (int j = 0 ; j < pile.length ; j++)
	    {
		int x1 = 0, x2 = 0;
		x1 = (int) (Math.random () * pile.length); //choosing two cards randomly
		do
		    x2 = (int) (Math.random () * pile.length);
		while (x1 == x2);
		//swapping them
		Card temp = new Card (); //temp variable
		temp.number = 0;
		temp.suit = 0;
		temp.number = pile [x1].number;
		temp.suit = pile [x1].suit;

		pile [x1].number = pile [x2].number; //?
		pile [x1].suit = pile [x2].suit;

		pile [x2].number = temp.number;
		pile [x2].suit = temp.suit;
	    }
	}
    }
}
