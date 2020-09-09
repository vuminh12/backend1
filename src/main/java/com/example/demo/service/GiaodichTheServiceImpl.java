package com.example.demo.service;

import com.example.demo.model.GiaodichThe;
import com.example.demo.repository.GiaodichTheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiaodichTheServiceImpl implements GiaodichTheService{
    @Autowired
    private GiaodichTheRepository giaodichTheRepository;


    @Override
    public Iterable<GiaodichThe> findAll() {
        return giaodichTheRepository.findAll();
    }

    @Override
    public GiaodichThe save(GiaodichThe giaodichThe) {
        return giaodichTheRepository.save(giaodichThe);
    }


}
