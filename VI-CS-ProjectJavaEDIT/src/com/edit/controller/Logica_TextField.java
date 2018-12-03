package com.edit.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Logica_TextField extends JFrame{
	public Logica_TextField() {
		
	}
	
	public void acepta_Numeros(JTextField jt) {
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				typedNumeros(e);
			}
		});
	}
	public void acepta_Letras(JTextField jt) {
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				typedLetra(e);
			}
		});
		
	}
	public void tamaño_8(JTextField jt) {
		
		int maximo=8;
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(jt.getText().length()>=maximo) {
					getToolkit().beep();
					e.consume();
					
				}
			}
		});
	}
	public void tamaño_10(JTextField jt) {
		
		int maximo=10;
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(jt.getText().length()>=maximo) {
					getToolkit().beep();
					e.consume();
					
				}
			}
		});
	}
	private void typedNumeros(KeyEvent e) {
		char c=e.getKeyChar();
		if(Character.isLetter(c)) {
			getToolkit().beep();
			e.consume();
			
		}
	}
	private void typedLetra(KeyEvent e) {
		char c=e.getKeyChar();
		if(Character.isDigit(c)) {
			getToolkit().beep();
			e.consume();
		}
	}
	public void AccionJcombo(JComboBox jc,JTextField jt) {
		jc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jc.getSelectedIndex()==1) {
					tamaño_8(jt);
					System.out.println(jc.getSelectedItem());
				}
				else{
					tamaño_10(jt);
					System.out.println(jc.getSelectedItem());
				}
			}
		});
	}
}
