package br.com.rdevs.springfilial.repository;

import br.com.rdevs.springfilial.model.entity.FilialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilialRepository extends JpaRepository<FilialEntity, Integer> {
}
