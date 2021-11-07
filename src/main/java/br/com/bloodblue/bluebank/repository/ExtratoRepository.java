package br.com.bloodblue.bluebank.repository;

import br.com.bloodblue.bluebank.entity.Extrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtratoRepository extends JpaRepository<Extrato, Long> {

}
