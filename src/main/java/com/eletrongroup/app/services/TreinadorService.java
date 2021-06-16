package com.eletrongroup.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eletrongroup.app.dtos.TreinadorDTO;
import com.eletrongroup.app.entities.Treinador;
import com.eletrongroup.app.repositories.TreinadorRepository;

@Service
public class TreinadorService {
	
	@Autowired
	private TreinadorRepository treinadorRepository;
	
	public Treinador saveTreinador(TreinadorDTO dto) {
		return treinadorRepository.save(dto.converterParaTreinador());
	}

}
