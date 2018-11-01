package com.bazooka.api.start;

import com.bazooka.api.model.Cidade;
import com.bazooka.api.model.Estado;
import com.bazooka.api.service.CidadeService;
import com.bazooka.api.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Initialize implements ApplicationRunner {

    @Autowired
    EstadoService estadoService;

    @Autowired
    CidadeService cidadeService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estado acre = estadoService.salvarEstado(new Estado("AC", "Acre"));
        Estado alagoas = estadoService.salvarEstado(new Estado("AL", "Alagoas"));
        Estado amapa = estadoService.salvarEstado(new Estado("AP", "Amapá"));
        Estado amazonas = estadoService.salvarEstado(new Estado("AM", "Amazonas"));
        Estado bahia = estadoService.salvarEstado(new Estado("BA", "Bahia"));
        Estado ceara = estadoService.salvarEstado(new Estado("CE", "Ceará"));
        Estado distrito = estadoService.salvarEstado(new Estado("DF", "Distrito Federal"));
        Estado espirito = estadoService.salvarEstado(new Estado("ES", "Espirito Santo"));

    }
}
