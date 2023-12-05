package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class KangarooController {
    private Map<Integer, Kangaroo> kangaroos;

    @PostConstruct
    public void init(){
        kangaroos = new HashMap<>();
    }

    @GetMapping("/")
    public List<Kangaroo> getAll(){
        return kangaroos.values().stream().toList();
    }
    @GetMapping("/{id}")
    public Kangaroo get(@PathVariable int id){
        if(!kangaroos.containsKey(id)){

        }
        return kangaroos.get(id);
    }
    @PostMapping("/")
    public Kangaroo save(@RequestBody Kangaroo kangaroo){
        if(kangaroos.containsKey(kangaroo.getId())){

        }
        //TODO:Check Kangroo credentials
        kangaroos.put(kangaroo.getId(),kangaroo);
        return kangaroos.get(kangaroo.getId());
    }
    @PutMapping("/{id}")
    public Kangaroo update(@PathVariable int id, @RequestBody Kangaroo kangaroo){
        if(id<=0){

        }
        if(!kangaroos.containsKey(id)) {

        }
        //TODO:Check Kangroo credentials
        return kangaroo
        }

        @DeleteMapping("/{id}")
    public Kangaroo delete(@PathVariable int id){
            if(!kangaroos.containsKey(id)) {

            }
            kangaroo kangroo= new Kangaroo();
    }

}
