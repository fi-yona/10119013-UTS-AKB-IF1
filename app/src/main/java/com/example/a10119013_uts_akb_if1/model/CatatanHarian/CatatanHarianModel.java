package com.example.a10119013_uts_akb_if1.model.CatatanHarian;

//NIM   : 10119013
//NAMA  : FIONA AVILA PUTRI
//KELAS : IF-1

public class CatatanHarianModel {
    private final String id;
    private final String judul;
    private final String kategori;
    private final String isi;
    private final String tanggal;

    public CatatanHarianModel(String id, String judul, String kategori, String isi, String tanggal) {
        this.id = id;
        this.judul = judul;
        this.kategori = kategori;
        this.isi = isi;
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public String getIsi() {
        return isi;
    }


    public String getTanggal() {
        return tanggal;
    }
}
