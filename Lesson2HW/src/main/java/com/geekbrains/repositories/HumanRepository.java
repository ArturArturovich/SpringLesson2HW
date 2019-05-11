package com.geekbrains.repositories;

import com.geekbrains.entites.Human;
import org.springframework.stereotype.Component;

@Component
public class HumanRepository {

    public Human findOneById(int id){
        Human human = new Human();
        human.setFirstName("Artur " + id);
        human.setLastName("Arturovich " + id);
        return human;
    }
}
