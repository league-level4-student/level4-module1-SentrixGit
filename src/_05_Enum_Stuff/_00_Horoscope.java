package _05_Enum_Stuff;

import javax.swing.JOptionPane;


public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("input stuff here");
		
		input = input.toLowerCase();
		switch(input) {
			case "aries": {
				giveHoroscope(Zodiac.ARIES);
				break;
			}
			case "taurus": {
				giveHoroscope(Zodiac.TAURUS);
				break;
			}
			case "gemini": {
				giveHoroscope(Zodiac.GEMINI);
				break;
			}
			case "cancer": {
				giveHoroscope(Zodiac.CANCER);
				break;
			}
			case "virgo": {
				giveHoroscope(Zodiac.VIRGO);
				break;
			}
			case "leo": {
				giveHoroscope(Zodiac.LEO);
				break;
			}
			case "libra": {
				giveHoroscope(Zodiac.LIBRA);
				break;
			}
			case "scorpio": {
				giveHoroscope(Zodiac.SCORPIO);
				break;
			}
			case "sagittarius": {
				giveHoroscope(Zodiac.SAGITTARIUS);
				break;
			}
			case "capricorn": {
				giveHoroscope(Zodiac.CAPRICORN);
				break;
			}
			case "aquarius": {
				giveHoroscope(Zodiac.AQUARIUS);
				break;
			}
			case "pisces": {
				giveHoroscope(Zodiac.PISCES);
				break;
			}
			
		}
	}
	// 3. Make a main method to test your method
	public static void giveHoroscope(Zodiac z) {
		switch(z) {
			case ARIES: {
				JOptionPane.showMessageDialog(null, "WOW YOU GOT Aries so cool!!!");
				break;
			}
			case TAURUS: {
				JOptionPane.showMessageDialog(null, "WOW YOU GOT TAURUS so cool!!!");
				break;
			}
			case GEMINI: {
				JOptionPane.showMessageDialog(null, "Gemini???");
				break;
			}
			case CANCER: {
				JOptionPane.showMessageDialog(null, "cancer :O");
				break;
			}
			case VIRGO: {
				JOptionPane.showMessageDialog(null, "WOW VIRGO SO EPIC!!!!!");
				break;
			}
			case LEO: {
				JOptionPane.showMessageDialog(null, "WOW YOU GOT LEO so cool!!!");
				break;
			}
			case LIBRA: {
				JOptionPane.showMessageDialog(null, "Libra how epicccccc");
				break;
			}
			case SCORPIO: {
				JOptionPane.showMessageDialog(null, "wow a scorpio :O");
				break;
			}
			case SAGITTARIUS: {
				JOptionPane.showMessageDialog(null, "What a long word");
				break;
			}
			case CAPRICORN: {
				JOptionPane.showMessageDialog(null, "Reminds me of candy corn");
				break;
			}
			case AQUARIUS: {
				JOptionPane.showMessageDialog(null, "water");
				break;
			}
			case PISCES: {
				JOptionPane.showMessageDialog(null, "not sure...");
				break;
			}
		}
	}
}
