package com.geekbrains.service;

import com.geekbrains.entites.Human;
import com.geekbrains.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HumanService {
    private HumanRepository humanRepository;

    @Autowired
    public void setHumanRepository(HumanRepository humanRepository){
        this.humanRepository = humanRepository;
    }

    public Human getHumanById(int id){
        Human human = humanRepository.findOneById(id);
        return human;
    }

    public HumanService(){

    }

    public ArrayList<Human> getAll() {
        return getAll();
    }
}
