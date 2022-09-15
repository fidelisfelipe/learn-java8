package br.com.learn.sam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import br.com.learn.about.SAM;

public class SamSupplierTest implements SAM{

	/**
	 * Aqui estamos chamando o método generate() do Stream API, que precisa de um Fornecedor para ser executado.
	 * Assim, não estamos passando nada para o método usando os parênteses vazios '()', 
	 * depois usando lambda '->' e finalmente executando o método - novo Random().nextInt() 
	 * que vai retornar algo para nós (neste caso, um número aleatório).
	 * Aqui, nós acabamos de adicionar o limite e coletamos os itens gerados em uma lista.
	 */
	@Test
	public void geracaoNumeroAleatorio() {
		int maxSize = 10;
		
		List<Integer> resultList = Stream.generate(()-> new Random().nextInt())
			.limit(maxSize)
			.collect(Collectors.toList());
		
		assertEquals(resultList.size(), maxSize);
	}

}
