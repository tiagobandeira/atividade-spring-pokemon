package com.eletrongroup.app.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.eletrongroup.app.dtos.TreinadorDTO;
import com.eletrongroup.app.entities.Treinador;
import com.eletrongroup.app.repositories.TreinadorRepository;

@Service
public class TreinadorService {
	
	@Autowired
	private TreinadorRepository treinadorRepository;
	
	public Treinador saveTreinador(TreinadorDTO dto) {
		//comeco como treinador
		return treinadorRepository.save(dto.converterParaTreinador());
	}
	public ResponseEntity<?> deleteTreinador(Long id){
		return treinadorRepository.findById(id).map(item ->{
    		treinadorRepository.deleteById(id);
    		return ResponseEntity.ok().build();
    	}).orElse(ResponseEntity.notFound().build());
	}
	
	public Treinador getTreinador(Long id){
		return treinadorRepository.getTreinadorById(id);
	}
	
	public List<Treinador> getTreinadorByAge(Long age) {
		Iterable<Treinador> treinadores = treinadorRepository.findAll();
		List<Treinador> treinadorList = new ArrayList();
		for (Treinador treinador : treinadores) {
			Date dataNas = treinador.getDataNascimento();
			if(dataNas.getYear() == (new Date().getYear() - age) ) {
				treinadorList.add(treinador);
			}
			
		}
		return treinadorList;
	}
	public List<String> getAllTreinador() {
		Iterable<Treinador> treinadores = treinadorRepository.findAll();
		List<String> treinadorListAll = new ArrayList();
		for (Treinador treinador : treinadores) {
			treinadorListAll.add(treinador.getNome());
		}
		return treinadorListAll;
	}

}
