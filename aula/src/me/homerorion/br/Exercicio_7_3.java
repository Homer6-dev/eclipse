package me.homerorion.br;

import javax.swing.JOptionPane;

public class Aula7_1 {
	
	/*03 - Faça um programa em Java que leia idade de uma pessoa expressa em anos, meses e 
	dias e escrever a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 
	dias e mês com 30 dias. */

	public static void main(String[] args) {
		int ano, mes, dia;
		JOptionPane.showMessageDialog(null,
				"Esse programa pedirá sua idade em anos, meses e dias respectivamente. Clique em ok para prosseguir \n");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês"));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
		int calc = (ano * 365) + (mes * 30) + dia;
		JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + calc);
	}

}
