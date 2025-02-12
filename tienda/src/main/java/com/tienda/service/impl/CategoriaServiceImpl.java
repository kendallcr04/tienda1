
package com.tienda.service.impl;

@service
public class CategoriaServiceImpl implements CategoriaService{
    
   @Autowired
   private CategoriaDao categoriaDao;
   
public List<categoria> getcategoria (boolean activos){
    var lista = categoriaDao.findAll();
    if (activos)
        lista.removeIf(c-> c. is activo());
}
        

return lista;
        }

