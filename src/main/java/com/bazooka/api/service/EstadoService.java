package com.bazooka.api.service;

import com.bazooka.api.model.Cidade;
import com.bazooka.api.model.Estado;
import com.bazooka.api.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstadoService{

    @Autowired
    EstadoRepository estadoRepository;

    public Iterable<Estado> listarEstados(){
        Optional<Iterable<Estado>> estados = Optional.ofNullable(this.estadoRepository.findAll());

        if(estados.isPresent()){
            return estados.get();
        }else{
            return new ArrayList<>();
        }
    }

    public Estado salvarEstado(Estado estado){
        return estadoRepository.save(estado);
    }


    public Estado buscarEstado(Long id){
        Optional<Estado> estado = Optional.ofNullable(estadoRepository.findById(id).get());

        if(estado.isPresent()){
            return estado.get();
        }else{
            return new Estado();
        }
    }

    public Iterable<Cidade> buscarCidadesPorEstado(Long id){
        Optional<Iterable<Cidade>> cidades = Optional.ofNullable(this.estadoRepository.findAllByCidades(id));

        if(cidades.isPresent()){
            return cidades.get();
        }else{
            return new ArrayList<Cidade>();
        }
    }

}
