package one.digitalinnovation.labpadroesprojetospring.repository;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
