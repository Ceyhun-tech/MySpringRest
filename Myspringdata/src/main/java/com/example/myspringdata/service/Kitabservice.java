package com.example.myspringdata.service;

import com.example.myspringdata.entity.Kitab;
import com.example.myspringdata.repository.KitabRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Kitabservice {
    private final KitabRepo kitabRepo;

    public Kitabservice(KitabRepo kitabRepo) {
        this.kitabRepo = kitabRepo;
    }

    public List<Kitab> getallKitab(){
        return kitabRepo.findAll();

    }

    public Kitab createKitab(Kitab kitab) {

        return kitabRepo.save(kitab);
    }

    public void deleteKitab(Integer id) {

        kitabRepo.deleteById(id);
    }

    public Kitab updateKitab(Integer id, Kitab kitab) {
      Optional <Kitab> kt=kitabRepo.findById(id);
      if(kt.isPresent()) {
          Kitab k = kt.get();
          k.setKid(kitab.getKid());
          k.setKad(kitab.getKad());
          k.setKseh(kitab.getKseh());
          k.setKni(kitab.getKni());
          return kitabRepo.save(k);
      }
      return null;
    }
}
