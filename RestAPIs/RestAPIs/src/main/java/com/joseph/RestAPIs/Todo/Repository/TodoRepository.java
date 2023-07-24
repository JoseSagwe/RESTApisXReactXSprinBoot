package com.joseph.RestAPIs.Todo.Repository;

import com.joseph.RestAPIs.Todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
