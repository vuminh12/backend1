package com.example.demo.service;

import com.example.demo.model.GiaodichKhachhang;
import org.springframework.stereotype.Service;

@Service
public interface GiaodichKhachhangService {
    Iterable<GiaodichKhachhang> findAll();
    GiaodichKhachhang save(GiaodichKhachhang giaodichkhachhang);
}
