package com.curso.java.aula20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#.##");
		double[][] notasAlunos = new double[12][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		notasAlunos[3][0] = 9;
		notasAlunos[3][1] = 8;
		notasAlunos[3][2] = 7;
		notasAlunos[3][3] = 9;

		notasAlunos[4][0] = 10;
		notasAlunos[4][1] = 7;
		notasAlunos[4][2] = 9;
		notasAlunos[4][3] = 9.5;

		notasAlunos[5][0] = 9;
		notasAlunos[5][1] = 8;
		notasAlunos[5][2] = 7;
		notasAlunos[5][3] = 9;

		notasAlunos[6][0] = 10;
		notasAlunos[6][1] = 7;
		notasAlunos[6][2] = 9;
		notasAlunos[6][3] = 9.5;

		notasAlunos[7][0] = 9;
		notasAlunos[7][1] = 8;
		notasAlunos[7][2] = 7;
		notasAlunos[7][3] = 9;

		notasAlunos[8][0] = 8;
		notasAlunos[8][1] = 9;
		notasAlunos[8][2] = 10;
		notasAlunos[8][3] = 7;

		notasAlunos[9][0] = 9;
		notasAlunos[9][1] = 8;
		notasAlunos[9][2] = 7;
		notasAlunos[9][3] = 9;

		notasAlunos[10][0] = 10;
		notasAlunos[10][1] = 7;
		notasAlunos[10][2] = 9;
		notasAlunos[10][3] = 9.5;

		notasAlunos[11][0] = 9;
		notasAlunos[11][1] = 8;
		notasAlunos[11][2] = 7;
		notasAlunos[11][3] = 9;

		for (int i = 0; i < notasAlunos.length; i++) {
			double somaNotas = 0;

			for (int j = 0; j < notasAlunos[i].length; j++) {
			
				somaNotas += notasAlunos[i][j];
			}

			double media = somaNotas / notasAlunos[i].length;

			if (media >= 7) {
				System.out.println("Passou: " + df.format(media));
				System.out.println();
			//} else {
				//System.out.println("\nReprovou: " + df.format(media));
			}

			System.out.println("Nota do Aluno 👏" + (i + 1) + ": ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();

			
		}
	}
}
