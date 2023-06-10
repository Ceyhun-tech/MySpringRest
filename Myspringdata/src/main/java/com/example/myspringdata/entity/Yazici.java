package com.example.myspringdata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="Yazici")
@Data

public class Yazici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ad",columnDefinition = "Text")
    private String ad;
    @Column(name = "soyad")
    private String soyad;
    @Column(name = "telnom", unique = true)
    private Integer telnom;
    /*@ManyToMany(mappedBy = "yazici")
    List<Kitab> kitab;*/
    public Yazici() {

    }
    public Yazici(Integer id, String ad, String soyad, Integer telnom) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.telnom = telnom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Integer getTelnom() {
        return telnom;
    }

    public void setTelnom(Integer telnom) {
        this.telnom = telnom;
    }
}
