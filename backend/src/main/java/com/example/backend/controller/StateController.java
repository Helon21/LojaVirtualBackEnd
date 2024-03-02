package com.example.backend.controller;

import com.example.backend.entity.State;
import com.example.backend.service.StateService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/find-all")
    public List<State> findAll(){
        return stateService.findAll();
    }

    @PostMapping("/register")
    public State insert(@RequestBody State state){
        return stateService.insert(state);
    }

    @PutMapping("/update")
    public State update(@RequestBody State state){
        return stateService.update(state);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        stateService.delete(id);
        return ResponseEntity.ok().build();
    }

}
