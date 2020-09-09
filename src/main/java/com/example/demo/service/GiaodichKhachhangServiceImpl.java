package com.example.demo.service;

import com.example.demo.model.GiaodichKhachhang;
import com.example.demo.repository.GiaodichKhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiaodichKhachhangServiceImpl implements GiaodichKhachhangService{
    @Autowired
    private GiaodichKhachhangRepository giaodichKhachhangRepository;

    @Override
    public Iterable<GiaodichKhachhang> findAll() {

        return giaodichKhachhangRepository.findAll();
    }

    @Override
    public GiaodichKhachhang save(GiaodichKhachhang giaodichkhachhang) {
        return save(giaodichkhachhang);
    }


}
