/*
 * En trinnskatt (tidligere toppskatt) er en progressiv s
 * katt på brutto lønn som beregnes når inntekten er høyere enn 164 100kr.
 * 
 * Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.
 * 
 * Kvart trinn fungerer som bøtter, kun summen for den trinnet blir skatted ved gitt prosent.
 * 
 * if løkker som rekner ut skatt frå input og legger til variabel.
 */


package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppg4 {

	public static void main(String[] args) {
		double sum;
		double inputInntekt = Double.parseDouble(showInputDialog("Bruttoinntekt: "));
		if ((inputInntekt >= 180800) && (inputInntekt <= 254500))
			sum = (inputInntekt - 180800) / 100 * 1.90;
		
		else if ((inputInntekt >= 254500) && (inputInntekt <= 639750)) {
			double trinn1 = (254500 - 180800) / 100 * 1.90;
			sum = ((inputInntekt - 254500) / 100 * 4.20) + (trinn1);
		}
			
		else if ((inputInntekt >= 639750) && (inputInntekt <= 999550)) {
			double trinn1 = (254500 - 180800) / 100 * 1.90;
			double trinn2 = (639750 - 254500) / 100 * 4.20;
			sum = ((inputInntekt - 639750) / 100 * 13.20) + (trinn1 + trinn2);
			
		}
			
		else if ((inputInntekt > 999550)) {
			double trinn1 = (254500 - 180800) / 100 * 1.90;
			double trinn2 = (639750 - 254500) / 100 * 4.20;
			double trinn3 = (999550 - 639750) / 100 * 13.20;
			sum = ((inputInntekt - 999550) / 100 * 16.20) + (trinn1 + trinn2 + trinn3);
		}
		else 
			sum = 0;
	
		showMessageDialog(null, "Du betaler " + Math.round(sum * 100.0) / 100.0 + " i skatt.");

	}

}
