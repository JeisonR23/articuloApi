package com.articulos.ap2.controller;

import com.articulos.ap2.modelo.Articulo;
import com.articulos.ap2.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class ArticuloControllers {
    @Autowired
    ArticuloService articuloService;

    @GetMapping("/articulos")
    public List<Articulo> list(){
        return articuloService.list();
    }

    @GetMapping("/articulos/{id}")
    public ResponseEntity<Articulo> findById(@PathVariable Integer id){
       try {
         Articulo articulo = articuloService.findById(id);
           return  new ResponseEntity<Articulo>( articulo, HttpStatus.OK);
       }catch (Exception e){
           return  new ResponseEntity<Articulo>(HttpStatus.NOT_FOUND);

       }
    }
    @PostMapping("/articulos")
    public void  save(@RequestBody Articulo articulo){
        articuloService.save(articulo);
    }

    @PutMapping("/articulos/{id}")
    public ResponseEntity<?> update (@RequestBody Articulo articulo, @PathVariable Integer id){
        try {
            Articulo articuloExistente = articuloService.findById(id);
            articuloService.save(articulo);
            return  new ResponseEntity<Articulo>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<Articulo>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/articulos/{id}")
    public void  delete(@PathVariable Integer id){
        articuloService.delete(id);
    }
}
