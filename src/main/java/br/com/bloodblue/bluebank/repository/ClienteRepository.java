package br.com.bloodblue.bluebank.repository;

import br.com.bloodblue.bluebank.entity.Cliente;
import br.com.bloodblue.bluebank.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCpf(String cpf);

    Cliente findByConta(Conta conta);

    @Query("SELECT c FROM Cliente c WHERE UPPER(c.nomeCompleto) LIKE CONCAT ('%', UPPER(:nomeCompleto), '%')")
    Optional<List<Cliente>> findByNome(String nomeCompleto);
}
