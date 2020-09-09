package com.example.demo.controller;

import com.example.demo.model.GiaodichKhachhang;
import com.example.demo.service.GiaodichKhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/giaodichKhachhang" , produces = "application/json")
@CrossOrigin(origins = "*")
public class GiaodichKhachhangController {
    @Autowired
    private GiaodichKhachhangService giaodichKhachhangService;

    @GetMapping
    public Iterable<GiaodichKhachhang> getAllTaikhoan() {
        return giaodichKhachhangService.findAll();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public GiaodichKhachhang postTaikhoan(@RequestBody GiaodichKhachhang giaodichKhachhang) {
        return giaodichKhachhangService.save(giaodichKhachhang);
    }
}
