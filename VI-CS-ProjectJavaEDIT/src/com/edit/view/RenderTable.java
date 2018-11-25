package com.edit.view;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderTable extends DefaultTableCellRenderer{
	
	public RenderTable() {
		
	}
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		//value: la logica con el color dias de atraso convertir un check o cambiar las forma de la celda.
		//isSlected si esta señalado la fila
		//row and column devuelve la fila y columna
		
		
			
		
		// TODO Auto-generated method stub
		return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
	}
}
	