public class Card
{
    int number = 0, suit = -1;
    //ace is 1, king is 13
    //diamonds = 0, clovers = 1, hearts = 2, spades = 3

    int getNum ()
    {
	return number;
    }


    int getSuit ()
    {
	return suit;
    }


    String name ()
    {
	String s = "";

	if (getNum () < 11 && getNum () > 1)
	    s = (getNum () + " of ");
	else if (getNum () == 1)
	    s = ("Ace of ");
	else if (getNum () == 11)
	    s = ("Jack of ");
	else if (getNum () == 12)
	    s = ("Queen of ");
	else if (getNum () == 13)
	    s = ("King of ");
	else
	    s = "ERROR";

	s = s + getSuitAsString ();
	return s;

    }


    int ownedByPlayer;


    String getSuitAsString ()
    {
	if (suit == 0)
	    return "Diamonds";
	else if (suit == 1)
	    return "Clovers";
	else if (suit == 2)
	    return "Hearts";
	else if (suit == 3)
	    return "Spades";
	else
	    return "Suit error***";
    }


    boolean numEquals (Card c2)
    {
	if (number == c2.getNum ())
	    return true;
	else
	    return false;
    }


    boolean numGreaterThan (Card c2)
    {
	if (number > c2.getNum ())
	    return true;
	else
	    return false;
    }


    boolean suitEquals (Card c1)
    {
	if (number == c1.getNum ())
	    return true;
	else
	    return false;
    }


    boolean suitGreaterThan (Card c1)
    {
	if (suit > c1.getSuit ())
	    return true;
	else
	    return false;
    }
}


