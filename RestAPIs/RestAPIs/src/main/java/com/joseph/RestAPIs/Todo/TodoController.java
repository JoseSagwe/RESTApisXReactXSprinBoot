package com.joseph.RestAPIs.Todo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping("users/{username}/todos")
    public List<Todo> retrieveTodos(@PathVariable String username){
        return service.findByUsername(username);
    }

    @GetMapping("users/{username}/todos/{id}")
    public Todo retrieveTodo(@PathVariable String username, @PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping ("users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable int id){
         service.deleteById(id);
         return ResponseEntity.noContent().build();
    }

//    @PatchMapping("/")
//    public void updateTodo(){
//        service.updateTodo(todo);
//    }
}
