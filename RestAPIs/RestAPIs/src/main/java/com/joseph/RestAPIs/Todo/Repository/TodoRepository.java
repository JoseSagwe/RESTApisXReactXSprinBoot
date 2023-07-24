package com.joseph.RestAPIs.Todo.Repository;

import com.joseph.RestAPIs.Todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUsername(String username);
}
