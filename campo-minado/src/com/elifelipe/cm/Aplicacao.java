package com.elifelipe.cm;

import com.elifelipe.cm.modelo.Tabuleiro;
import com.elifelipe.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
