package com.example.gorseldegistir;

public class Gorsel {

    private String bilgi;
    private int siraNo;
    private int foto;


    public Gorsel(String bilgi, int siraNo, int foto) {
        this.bilgi = bilgi;
        this.siraNo = siraNo;
        this.foto = foto;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }
}
