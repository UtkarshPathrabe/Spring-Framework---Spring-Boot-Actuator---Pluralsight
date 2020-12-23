package io.pathrabe.utkarsh.todoapp.repository;

import io.pathrabe.utkarsh.todoapp.model.TodoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoList, Long> {

}
