package com.articulos.ap2.service;

import com.articulos.ap2.modelo.Articulo;
import com.articulos.ap2.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    public List<Articulo> list(){
        return articuloRepository.findAll();
    }

    public void  save(Articulo articulo){
         articuloRepository.save(articulo);
    }

    public Articulo  findById(Integer id){
       return articuloRepository.findById(id).get();
    }

    public void  delete(Integer id){
        articuloRepository.deleteById(id);
    }



}
