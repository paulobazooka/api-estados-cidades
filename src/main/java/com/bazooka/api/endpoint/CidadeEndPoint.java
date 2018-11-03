package com.bazooka.api.endpoint;

import com.bazooka.api.model.Cidade;
import com.bazooka.api.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cidade")
public class CidadeEndPoint {

    @Autowired
    CidadeService cidadeService;

    @GetMapping
    @RequestMapping("/{id}")
    public Iterable<Cidade> getCidades(@PathVariable Integer id){
        Optional<Iterable<Cidade>> cidades = Optional.ofNullable(cidadeService.listarCidadesPorEstado(id));

        if(cidades.isPresent()){
            return cidades.get();
        }else{
            return new ArrayList<>();
        }
    }

}
