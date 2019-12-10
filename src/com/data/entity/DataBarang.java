package com.data.entity;


public class DataBarang {
    private String kodeBuku;
    private String judulBuku;
    private String penulisBuku;
    private String penerbitBuku;
    private String tahunBuku;
    private String hargaBuku;

    public DataBarang(String kodeBuku, String judulBuku, String penulisBuku, String penerbitBuku, String tahunBuku, String hargaBuku) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.penerbitBuku = penerbitBuku;
        this.tahunBuku = tahunBuku;
        this.hargaBuku = hargaBuku;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenulisBuku() {
        return penulisBuku;
    }
    public void setPenulisBuku(String penulisBuku) {
        this.penulisBuku = penulisBuku;
    }

    public String getPenerbitBuku() {
        return penerbitBuku;
    }
    public void setPenerbitBuku(String penerbitBuku) {
        this.penerbitBuku = penerbitBuku;
    }

    public String getTahunBuku() {
        return tahunBuku;
    }
    public void setTahunBuku(String tahunBuku) {
        this.tahunBuku = tahunBuku;
    }

    public String getHargaBuku() {
        return hargaBuku;
    }
    public void setHargaBuku(String hargaBuku) {
        this.hargaBuku = hargaBuku;
    }
}
