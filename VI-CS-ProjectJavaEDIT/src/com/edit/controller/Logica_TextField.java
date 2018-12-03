package com.edit.controller;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Logica_TextField extends JFrame{
	public Logica_TextField() {
		
	}
	
	public void acepta_Numeros(JTextField jt) {
		jt.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("unused")
			public void keyNumero(KeyEvent e) {
				typedNumeros(e);
			}
		});
	}
	public void acepta_Letras(JTextField jt) {
		jt.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("unused")
			public void keyLetra(KeyEvent e) {
				typedLetra(e);
			}
		});
		
	}
	private void typedLetra(KeyEvent e) {
		char c=e.getKeyChar();
		if(Character.isDigit(c)) {
			getToolkit().beep();
			e.consume();
		}
	}
	private void typedNumeros(KeyEvent e) {
		char c=e.getKeyChar();
		if(Character.isDigit(c)) {
			getToolkit().beep();
			e.consume();
		}
	}
}
