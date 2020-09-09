package com.example.demo.service;

import com.example.demo.model.GiaodichThe;
import org.springframework.stereotype.Service;

@Service
public interface GiaodichTheService {
    Iterable<GiaodichThe> findAll();
     GiaodichThe save(GiaodichThe giaodichThe);
}
