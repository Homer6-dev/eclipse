package me.homerorion.br;

import javax.swing.JOptionPane;

public class Aula7_1 {

	public static void main(String[] args) {
		int ano, mes, dia;
		JOptionPane.showMessageDialog(null,
				"Esse programa pedir� sua idade em anos, meses e dias respectivamente. Clique em ok para prosseguir \n");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do m�s"));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
		int calc = (ano * 365) + (mes * 30) + dia;
		JOptionPane.showMessageDialog(null, "Sua idade em dias �: " + calc);
	}

}
