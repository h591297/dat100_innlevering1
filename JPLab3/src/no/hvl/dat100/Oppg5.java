/*
 * Program som skal lese brukerinput poengsum 0-100 til 10 elever 
 * og skrive ut karakter A-F ut i frå poengsum. 
 * Kontroll på feilinput (negativ eller over 100)
 * 
 * Vi veit antall gangar input trengs (10) , omgi alt i for løkke.
 * Tving bruker til å skrive gyldig input før programmet fortsetter (ikkje telle feil input i for løkke)
 * Utnytte while løkke for å sjekke om input er ok. while = false -> forsett vidare.
 * while løkka må være positiv når input er feil for å gjenta while løkke.
 * If setningar til å fylle variabel "karakter" med rett karakter.
 * Print resultat for brukar.
 * 
 */

package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppg5 {

	public static void main(String[] args) {
		for (int student = 1; student <= 10; student++) {
			String karakter;
			int inputPoeng = Integer.parseInt(showInputDialog("Poengsum 0 - 100: "));
			while ((inputPoeng < 0) || (inputPoeng > 100)) { //hopper over blokk om false.
				showMessageDialog(null, "Du må velge ein lovelig sum mellom 0 og 100.");
				inputPoeng = Integer.parseInt(showInputDialog("Poengsum 0 - 100: "));
			}
			if (inputPoeng <= 39)
				karakter = "F";
			else if ((inputPoeng >= 40) && (inputPoeng <= 49))
				karakter = "E";
			else if ((inputPoeng >= 50) && (inputPoeng <= 59))
				karakter = "D";
			else if ((inputPoeng >= 60) && (inputPoeng <= 79))
				karakter = "C";
			else if ((inputPoeng >= 80) && (inputPoeng <= 89))
				karakter = "B";
			else
				karakter = "A";
			
			showMessageDialog(null, "Du fekk karakter: " + karakter);
		}
	}
}
