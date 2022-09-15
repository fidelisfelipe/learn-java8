package br.com.learn.about;

/**
 * A letra T significa que � gen�rica (gen�rico significa que pode ser de qualquer tipo), 
 * e neste caso significa que a opera��o get(), 
 * quando executada, vai devolver algo para n�s 
 * e pode ser de qualquer tipo.
 * Por outro lado, n�o precisamos passar um argumento. 
 * Em resumo, chamamos isso e recebemos algo, como um fornecedor (justifica assim o nome).
 */
public interface SAMSupplier<T> extends SAM{
	T get();
}