package com.example.demo.repository;

import com.example.demo.model.Nhanvien;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends CrudRepository<Nhanvien,String> { }
