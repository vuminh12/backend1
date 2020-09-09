package com.example.demo.controller;

import com.example.demo.model.GiaodichThe;
import com.example.demo.service.GiaodichTheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GiaodichTheController {
    @Autowired
    private GiaodichTheService giaodichTheService;

    @GetMapping
    public Iterable<GiaodichThe> getAllTaikhoan() {
        return giaodichTheService.findAll();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void postTaikhoan(@RequestBody GiaodichThe giaodichThe) {
         giaodichTheService.save(giaodichThe);
    }
}
