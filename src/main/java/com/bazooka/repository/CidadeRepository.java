package com.bazooka.repository;

import com.bazooka.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    Iterable<Cidade> findAllByEstado(Integer estado);
}
