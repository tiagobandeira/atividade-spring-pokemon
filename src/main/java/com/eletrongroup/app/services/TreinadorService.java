package com.eletrongroup.app.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.eletrongroup.app.exception.NotFoudException;
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

    public void deleteTreinador(Long id) {
        Treinador treinador = getTreinador(id);
        treinadorRepository.getTreinadorById(id);
    }

    public Treinador getTreinador(Long id) {
        Treinador trainer = treinadorRepository.getTreinadorById(id);
        if (trainer == null) {
            throw new NotFoudException();
        }
        return trainer;
    }

    public List<Treinador> getTreinadorByAge(Long age) {
        Iterable<Treinador> treinadores = treinadorRepository.findAll();
        List<Treinador> treinadorList = new ArrayList();
        for (Treinador treinador : treinadores) {
            Date dataNas = treinador.getDataNascimento();
            if (dataNas.getYear() == (new Date().getYear() - age)) {
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
