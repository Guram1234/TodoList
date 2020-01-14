package com.pyramid.TodoList;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends MongoRepository<Todo, String> {
    public Optional<List<Todo>> findByIsCompleteFalse();

}
