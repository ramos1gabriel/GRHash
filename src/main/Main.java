package main;

import javax.swing.JOptionPane;

import view.Interface;
import crypt.*;

public class Main {

	public static void main(String[] args) {
		input();
		//new Interface().setVisible(true);
	}
	
	public static void input() {
		
		String frase = JOptionPane.showInputDialog("Entre com uma frase:");
		String fraseCrypt = Criptografia.criptografar(frase);
		//JOptionPane.showMessageDialog(null, fraseCrypt, "", JOptionPane.ERROR_MESSAGE);
		System.out.println("Frase Criptografada = " + fraseCrypt);
		
		String frase1 = JOptionPane.showInputDialog("Entre com uma alguma trecho criptografado:");
		String frase1Crypt = Criptografia.descriptografar(frase1);
		
		System.out.println("Frase Descriptografada = " + frase1Crypt);
	}
}
