package ufpbook;

import java.io.Serializable;
import java.util.ArrayList;

public class Comentario implements Serializable {
    private Usuario autor;
    private String texto;
    private ArrayList<Comentario> comentarios;
    
    public Comentario(Usuario autor, String texto){
        this.autor = autor;
        this.texto = texto;
        comentarios = new ArrayList<>() ;
    }

    public Usuario getAutor() {
        return autor;
    }

   public String getTexto() {
        return texto;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }
    
    public void addComentario(Comentario coment) {
        comentarios.add(coment);
    }
    
    public void removeComentario(Comentario coment){
        comentarios.remove(coment);
    }
}
