package com.example.backend.service;

import com.example.backend.entity.State;
import com.example.backend.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;


@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> findAll(){
        return stateRepository.findAll();
    }

    public State insert(State state) {
        state.setCreationDate(new Date());
        State newState = stateRepository.saveAndFlush(state);
        return newState;
    }

    public State update(State state){
        state.setUpdateDate(new Date());
        stateRepository.saveAndFlush(state);
        return stateRepository.saveAndFlush(state);
    }

    public void delete(Long id){
        State state = stateRepository.findById(id).get();
        stateRepository.delete(state);
    }


}
