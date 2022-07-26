
package com.egg.eggNews.servicios;

import com.egg.eggNews.repositorios.NoticiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;


public class noticiaServicio {
    
    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
}
