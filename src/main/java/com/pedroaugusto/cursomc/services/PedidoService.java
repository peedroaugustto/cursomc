package com.pedroaugusto.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedroaugusto.cursomc.domain.Pedido;
import com.pedroaugusto.cursomc.repositories.PedidoRepository;
import com.pedroaugusto.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id
					+ ", Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
	
}