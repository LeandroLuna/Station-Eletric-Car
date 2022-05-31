package br.com.fiap.components;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BorderFactory {
	public static Border create() {
		return new LineBorder(Color.BLACK);
	}
}