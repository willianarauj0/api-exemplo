package application.model.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Tarefa;

public interface TarefaRepository extends CrudRepository<Tarefa, Long>  {
    
}
