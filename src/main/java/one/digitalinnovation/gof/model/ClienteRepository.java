package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//repository é uma interface que provê todos os métodos de acesso aos dados da entity
//crudrepository é um strategy que é um interface que me obriga a seria a estratégia de implementação
@Repository//opcional
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}