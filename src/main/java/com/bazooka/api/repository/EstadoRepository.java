package com.bazooka.api.repository;

import com.bazooka.api.model.Cidade;
import com.bazooka.api.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    Iterable<Cidade> findAllByCidades(Long id);
}
