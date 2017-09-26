package com.pedroaugusto.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedroaugusto.cursomc.domain.Categoria;
import com.pedroaugusto.cursomc.repositories.CategoriaRepository;
import com.pedroaugusto.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
	
}