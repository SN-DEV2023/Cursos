package com.curso.java.aula24;

import java.util.Scanner;

public class Livro2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Livro tipoDeLivro = new Livro();

		System.out.println("Escolha um livro");
		String harryPotter = scan.nextLine();

		System.out.println(harryPotter);
		switch (harryPotter) {
		case "Harry Potter":
			System.out.println("Você escolheu o livro Harry Potter");

			//tipoDeLivro.livro = "Livro: 👇👇👇 ";
			tipoDeLivro.título = "Titulo: ";
			tipoDeLivro.autores = "Autores: ";
			tipoDeLivro.editora = "Editora: ";
			tipoDeLivro.idioma = "Idioma: ";
			tipoDeLivro.genero = "Gênero: ";

			//System.out.println(tipoDeLivro.livro);
			System.out.println();
			System.out.println(tipoDeLivro.título + " " + "Harry Potter e a Pedra Filosofal  ");
			System.out.println();
			System.out.println(tipoDeLivro.autores + " " + "J.K. Rowling");
			System.out.println();
			System.out.println(tipoDeLivro.editora + " " + "Rocco ");
			System.out.println();
			System.out.println(tipoDeLivro.idioma + " " + "Português");
			System.out.println();
			System.out.println(tipoDeLivro.genero + " " + "Fantasia");

			break;
		default:
			System.out.println("Objeto não encontrado");

		}

	}

}
