package one.digitalinnovation.labpadroesprojetospring.repository;

import one.digitalinnovation.labpadroesprojetospring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
