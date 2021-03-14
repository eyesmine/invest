package com.example.invest.controller;

import com.example.invest.model.st_list;
import com.example.invest.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SearchController {

    @Autowired
    private SearchRepository searchRepository;

    @GetMapping("/search")
    public List<st_list> getSearchList(){
        List<st_list> list = searchRepository.findAll();
        
        return list;
    }

    @GetMapping("/search/{id}")
    public String getSearch(@PathVariable Long id){
        Optional<st_list> listOptional = searchRepository.findById(id);
        listOptional.ifPresent(System.out::println);

        return "successfully excuted";
    }

}
