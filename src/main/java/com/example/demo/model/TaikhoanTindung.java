package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="taikhoantindung")
public class TaikhoanTindung {
    @Id
    private String mataikhoantindung;
    private String tenloaitaikhoan;
    private float soduhientai;
    private float hanmuctoida;
    private  float sonohientai;

    public String getMataikhoantindung() {
        return mataikhoantindung;
    }

    public void setMataikhoantindung(String mataikhoantindung) {
        this.mataikhoantindung = mataikhoantindung;
    }

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public Float getSoduhientai() {
        return soduhientai;
    }

    public void setSoduhientai(Float soduhientai) {
        this.soduhientai = soduhientai;
    }

    public float getHanmuctoida() {
        return hanmuctoida;
    }

    public void setHanmuctoida(float hanmuctoida) {
        this.hanmuctoida = hanmuctoida;
    }

    public void setSoduhientai(float soduhientai) {
        this.soduhientai = soduhientai;
    }

    public float getSonohientai() {
        return sonohientai;
    }

    public void setSonohientai(float sonohientai) {
        this.sonohientai = sonohientai;
    }
}
