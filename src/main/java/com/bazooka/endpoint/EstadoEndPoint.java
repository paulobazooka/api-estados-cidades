package com.bazooka.endpoint;

import com.bazooka.model.Cidade;
import com.bazooka.model.Estado;
import com.bazooka.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/estado")
public class EstadoEndPoint {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public Iterable<Estado> getEstados() {
        return estadoService.listarEstados();
    }
}
