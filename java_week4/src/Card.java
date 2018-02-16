//Thanakorn Pasangthien Section1 6088109
public class Card {
	private String cardNotation;
	
	Card(String notation){
		this.cardNotation = notation;
	}
	public String getDescription() {
		char ch = cardNotation.charAt(0);
		String number,value;
		switch(ch) {
			case'2': number = "Two"; break;
			case'3': number = "Three"; break;
			case'4': number = "Four"; break;
			case'5': number = "Five"; break;
			case'q': number = "Thank you Bye !!"; break;
			default: return "Unknown";
		}
		char ch1 = cardNotation.charAt(1);
		switch(ch1) {
		case'A': value = "Ace";	break;
		case'J': value = "Jack"; break;
		case'Q': value = "Queen"; break;
		case'K': value = "King"; break;
		case'S': value = "Spades"; break;
		default: return "Unknown";
		}
		return number+" "+value;
	}
}
