package com.bazooka.api.repository;

import com.bazooka.api.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    Iterable<Cidade> findAllByEstado(Integer estado);
}
