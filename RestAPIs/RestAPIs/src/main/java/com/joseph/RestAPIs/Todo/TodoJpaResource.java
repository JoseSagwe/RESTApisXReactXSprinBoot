package com.joseph.RestAPIs.Todo;

import com.joseph.RestAPIs.Todo.Repository.TodoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoJpaResource {

    private TodoService service;

    private TodoRepository repository;

    public TodoJpaResource(TodoService service, TodoRepository repository ) {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping("users/{username}/todos")
    public List<Todo> retrieveTodos(@PathVariable String username){
       // return service.findByUsername(username);
        return repository.findByUsername(username);
    }

    @GetMapping("users/{username}/todos/{id}")
    public Todo retrieveTodo(@PathVariable String username, @PathVariable int id){
        //return service.findById(id);
        return repository.findById(id).get();
    }

    @DeleteMapping ("users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable int id){
//         service.deleteById(id);
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping ("users/{username}/todos/{id}")
    public Todo updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody Todo todo){
//        service.updateTodo(todo);
        repository.save(todo);
        return todo;
    }

    @PostMapping ("users/{username}/todos")
    public Todo createTodo(@PathVariable String username, @RequestBody Todo todo){
        todo.setUsername(username);
        todo.setId(null);
        return repository.save(todo);
//        Todo createdTodo =  service.addTodo(username, todo.getDescription(), todo.getTargetDate(), todo.isDone());
//        return createdTodo;
    }
}
