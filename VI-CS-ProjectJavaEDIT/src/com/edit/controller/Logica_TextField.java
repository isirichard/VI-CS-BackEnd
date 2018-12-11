package com.edit.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * Esta clase Ayuda a la logica sobre los texfield ya sea que solo acepte numeros o letras, capture los botones por los JTEXFIELD
 * @author Andre Cruz Gonzales
 *
 */
public class Logica_TextField extends JFrame{
	public Logica_TextField() {
		
	}
	/**
	 * Este metodo asigna a un JTEXTFIELD que solo se pueda digitar numeros
	 * @param jt
	 */
	public void acepta_Numeros(JTextField jt) {
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				typedNumeros(e);
			}
		});
	}
	/**
	 * Este metodo asigna a un JTEXTFIELD que solo se pueda digitar letras
	 * @param jt
	 */
	public void acepta_Letras(JTextField jt) {
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				typedLetra(e);
			}
		});
		
	}
	/**
	 * Este metodo asigna a un JTEXTFIELD que solo se pueda digitar 8 numeros como maximo
	 * @param jt
	 */
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
	/**
	 * Este metodo asigna a un JTEXTFIELD que solo se pueda digitar 10 numeros como max
	 * @param jt
	 * @param max
	 */
	public void tamaño_10(JTextField jt,int max) {
		
		
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(jt.getText().length()>=max) {
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
	/**
	 * Este metodo asigna a un JCOMBOBOX que se pueda apretar la tecla enter y tenga accion a un boton
	 * @param jc
	 * @param jt
	 */
	public void AccionJcombo(JComboBox jc,JTextField jt) {
		jc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jc.getSelectedIndex()==1) {
					tamaño_10(jt,8);
					System.out.println(jc.getSelectedItem());
				}
				else{
					tamaño_10(jt,10);
					System.out.println(jc.getSelectedItem());
				}
			}
		});
	}
	
	private void btnEnter(JButton btn,KeyEvent e) {
		char tecla=e.getKeyChar();
		
		if(tecla==KeyEvent.VK_ENTER) {
			btn.doClick();
		}
	}
	/**
	 * Este metodo asigna a un JTEXTFIELD que al presionar enter se pueda activar ese JBUTON
	 * @param jt
	 * @param btn
	 */
	public void btnEnter(JTextField jt,JButton btn) {
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				btnEnter(btn,e);
			}
		});
	}
	/**
	 * Captura el boton Enter presionando en cualquier JTEXFIEL que entre en parametro
	 * @param jt
	 */
	public void btnEnter(JTextField jt) {
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
	}
}
