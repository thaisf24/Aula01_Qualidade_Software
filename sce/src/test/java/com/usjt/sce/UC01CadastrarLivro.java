package com.usjt.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usjt.sce.model.Livro;

public class UC01CadastrarLivro {
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02CadastrarLivroISBNBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}

	@Test
	public void CT03CadastrarLivrocomISBNInvalido_nulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}

	@Test
	public void CT04CadastrarLivroComDadosValidos() {
		// cenario
		Livro umLivro = new Livro();
		// acao
		umLivro = ObtemLivro.comDadosValidos();

		assertEquals("121212", umLivro.getIsbn());
	}

	@Test
	public void CT05CadastrarLivroComDadosValidos() {
		// cenario
		Livro umLivro = new Livro();
		// acao
		umLivro = ObtemLivro.comDadosValidos();

		assertEquals("Enmgenharia de Software", umLivro.getTitulo());
	}
}
