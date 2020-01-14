package com.algaworks.socialbooks.service.exception;

public class AutorNaoEncontradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4529112685286480918L;


	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
	
}
