package com.example.myspringdata.controller;

import com.example.myspringdata.entity.Kitab;
import com.example.myspringdata.service.Kitabservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitablar")
public class Kitabcontroller {
   private final Kitabservice kitabservice;
   public Kitabcontroller(Kitabservice kitabservice){

       this.kitabservice=kitabservice;
   }

   @GetMapping("/all")
    public List<Kitab> getallKitab(){

       return kitabservice.getallKitab();
   }
   @PostMapping("/new")
    public Kitab createKitab(@RequestBody Kitab kitab){
       return kitabservice.createKitab(kitab);

   }
   @DeleteMapping("/delete/{id}")
    public void deleteKitab(@PathVariable Integer id){
       kitabservice.deleteKitab(id);

   }
   @PutMapping("/edit/{id}")
    public Kitab updateKitab(@PathVariable Integer id, @RequestBody Kitab kitab){
       return kitabservice.updateKitab(id, kitab);
   }

  


}
