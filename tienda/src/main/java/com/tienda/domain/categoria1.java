
package com.tienda.domain;
import lombok.data;
import jakarta.persitence.*:
import java.io.serializable
@data 
@entity
@table (name = "categoria")
public class categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ID
    @generatedValue(stategy = generationType.IDENTITY)
    private long idCategoria //id_categoria
    private string descripcion;
    private string rutaImagen;
    private boolean activo;        
    
    
    public Categoria(){
    }
    
    public Categoria (String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
}
