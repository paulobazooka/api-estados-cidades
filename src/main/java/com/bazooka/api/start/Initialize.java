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

      /*  Estado estado = new Estado();
        estado.setId(70);
        estado.setSigla("ZZ");
        estado.setNome("Insominiac");
        estadoService.salvarEstado(estado);


        Cidade cidade = new Cidade();
        cidade.setId(20000);
        cidade.setNome("MZESLD");
        cidade.setEstado(70);
        cidadeService.salvarCidade(cidade);*/

    }
}
