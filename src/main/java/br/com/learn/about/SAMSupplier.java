package br.com.learn.about;

/**
 * A letra T significa que é genérica (genérico significa que pode ser de qualquer tipo), 
 * e neste caso significa que a operação get(), 
 * quando executada, vai devolver algo para nós 
 * e pode ser de qualquer tipo.
 * Por outro lado, não precisamos passar um argumento. 
 * Em resumo, chamamos isso e recebemos algo, como um fornecedor (justifica assim o nome).
 */
public interface SAMSupplier<T> extends SAM{
	T get();
}