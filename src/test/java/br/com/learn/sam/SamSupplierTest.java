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
	 * Aqui estamos chamando o m�todo generate() do Stream API, que precisa de um Fornecedor para ser executado.
	 * Assim, n�o estamos passando nada para o m�todo usando os par�nteses vazios '()', 
	 * depois usando lambda '->' e finalmente executando o m�todo - novo Random().nextInt() 
	 * que vai retornar algo para n�s (neste caso, um n�mero aleat�rio).
	 * Aqui, n�s acabamos de adicionar o limite e coletamos os itens gerados em uma lista.
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
