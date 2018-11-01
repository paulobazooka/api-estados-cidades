package com.bazooka.api.service;

import com.bazooka.api.model.Cidade;
import com.bazooka.api.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidade salvarCidade(Cidade cidade){
        return this.cidadeRepository.save(cidade);
    }


    public Cidade buscarCidade(Long id){
        Optional<Cidade> cidade = Optional.ofNullable(this.cidadeRepository.findById(id).get());

        if(cidade.isPresent()){
            return cidade.get();
        }else{
            return new Cidade();
        }
    }

}
