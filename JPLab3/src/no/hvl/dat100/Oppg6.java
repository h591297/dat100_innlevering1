/*
 * Lag et program som leser inn et heltall n > 0, 
 * beregner verdien n! (n fakultet) og skriver verdien 
 * til n! der n! = 1\*2\*3\*…\*(n-1)\*n.
 * 
 * n!=n(n-1)!
 */

package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppg6 {

	public static void main(String[] args) {
		int sum = 1; //Må sette 1, koden setter seg fast dersom * 0.
		int inputN = Integer.parseInt(showInputDialog(("Skriv heiltal n:" )));
		while (inputN < 0)
			inputN = Integer.parseInt(showInputDialog(("n må være > 0:" )));
		for (int i = 1; i <= inputN; i++) {
			sum = sum * i;
			//System.out.println(sum);
		}
		showMessageDialog(null, "n fakultet er: " + sum);
	}

}
