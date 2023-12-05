package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;

import java.util.Map;

public class AnimalValidator {
    public static void isIdValid(int id){
        if(id<=0){
            throw new AnimalException("id is not valid" + id , HttpStatus.BAD_REQUEST);

        }
    }

    public static void isIdNotExist(Map animals,int id){
        if(!animals.containsKey(id)){
            throw new AnimalException("Animal eith given is not exist" + id , HttpStatus.NOT_FOUND);

        }
    }

    public static void isIdExist(Map animals, int id){
        if(!animals.containsKey(id)){
            throw new AnimalException("Animal eith given is already exist" + id , HttpStatus.BAD_REQUEST);

        }
    }
}
