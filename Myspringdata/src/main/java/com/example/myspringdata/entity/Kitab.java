package com.example.myspringdata.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.example.myspringdata.entity.Yazici;

import java.util.HashSet;
import java.util.List;

@Entity
@Table(name="kitab")
@Data
public class Kitab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kid")
    private Integer kid;
    @Column(name = "kad",nullable = false, columnDefinition = "Text")
    private String  kad;
    @Column(name = "kseh",nullable = false, unique = false)
    private Integer kseh;
    @Column(name = "kni",nullable = false, unique = false)
    private Integer kni;

  @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name = "KY",
            joinColumns = @JoinColumn(name = "kid"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    List <Yazici> yazici;

    public Kitab() {
    }

    public Kitab(Integer kid, String kad, Integer kseh, Integer kni) {
        this.kid = kid;
        this.kad = kad;
        this.kseh = kseh;
        this.kni = kni;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKad() {
        return kad;
    }

    public void setKad(String kad) {
        this.kad = kad;
    }

    public Integer getKseh() {
        return kseh;
    }

    public void setKseh(Integer kseh) {
        this.kseh = kseh;
    }

    public Integer getKni() {
        return kni;
    }

    public void setKni(Integer kni) {
        this.kni = kni;
    }
}
