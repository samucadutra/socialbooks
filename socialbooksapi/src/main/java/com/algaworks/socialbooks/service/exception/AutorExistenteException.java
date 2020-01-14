package com.algaworks.socialbooks.service.exception;

public class AutorExistenteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4529112685286480918L;


	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
	
}
