package br.com.bloodblue.bluebank.repository;

import br.com.bloodblue.bluebank.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpf(String cpf);

    @Query("SELECT c FROM Cliente c WHERE c.nomeCompleto LIKE CONCAT ('%', :nomeCompleto, '%')")
    Optional<List<Cliente>> findByNome(String nomeCompleto);
}
