package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "taikhoantietkiem")
@Table
public class TaikhoanTietkiem {
    @Id
    private String mataikhoantietkiem;
    private String tenloaitaikhoan;
    private float laisuathangthang;
    private float sodutoithieu;

    public String getMataikhoantietkiem() {
        return mataikhoantietkiem;
    }

    public void setMataikhoantietkiem(String mataikhoantietkiem) {
        this.mataikhoantietkiem = mataikhoantietkiem;
    }

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public float getSodutoithieu() {
        return sodutoithieu;
    }

    public void setSodutoithieu(float sodutoithieu) {
        this.sodutoithieu = sodutoithieu;
    }

    public float getLaisuathangthang() {
        return laisuathangthang;
    }

    public void setLaisuathangthang(float laisuathangthang) {
        this.laisuathangthang = laisuathangthang;
    }
}
