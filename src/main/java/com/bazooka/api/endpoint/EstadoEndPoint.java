package com.bazooka.api.endpoint;

import com.bazooka.api.model.Cidade;
import com.bazooka.api.model.Estado;
import com.bazooka.api.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/estado")
public class EstadoEndPoint {

    @Autowired
    EstadoService estadoService;

    @GetMapping
    public Iterable<Estado> getEstados(){
        return estadoService.listarEstados();
    }

    @GetMapping("/{id}")
    public Estado buscarEstado(@PathVariable Long id){
        return estadoService.buscarEstado(id);
    }

    @GetMapping("/{id}/cidades")
    public Iterable<Cidade> buscarCidadesPorEstado(@PathVariable Long id){
        return estadoService.buscarCidadesPorEstado(id);
    }
}
