package com.example.boot;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "todo", path = "todo")
public interface ToDoRepository extends CrudRepository<Todos,Integer> {
}
