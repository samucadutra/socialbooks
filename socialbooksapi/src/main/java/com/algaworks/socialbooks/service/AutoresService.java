package com.algaworks.socialbooks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.socialbooks.domain.Autor;
import com.algaworks.socialbooks.repository.AutoresRepository;
import com.algaworks.socialbooks.service.exception.AutorExistenteException;
import com.algaworks.socialbooks.service.exception.AutorNaoEncontradoException;

@Service
public class AutoresService {
	
	@Autowired
	AutoresRepository autoresRepository;
	
	public List<Autor> listar(){
		return autoresRepository.findAll();
	}
	
	public Autor salvar(Autor autor) {
		if(autor.getId() != null) {
			Optional<Autor> buscaAutor = autoresRepository.findById(autor.getId());
			if(buscaAutor.isPresent()) {
				throw new AutorExistenteException("O autor já existe.");
			}
		}
		return autoresRepository.save(autor);
	}
	
	public Autor buscar(Long id) {
		Optional<Autor> buscaAutor = autoresRepository.findById(id);
		
		if(!buscaAutor.isPresent()) {
			throw new AutorNaoEncontradoException("O autor não pode ser encontrado.");
		}
		
		return buscaAutor.get();
	}
	
	

}
