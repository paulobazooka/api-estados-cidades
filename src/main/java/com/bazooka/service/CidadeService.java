package com.bazooka.service;

import com.bazooka.model.Cidade;
import com.bazooka.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidade salvarCidade(Cidade cidade){
        return this.cidadeRepository.save(cidade);
    }

    public Iterable<Cidade> listarCidadesPorEstado(Integer estado){
        return cidadeRepository.findAllByEstado(estado);
    }
}
