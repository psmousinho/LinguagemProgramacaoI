package ufpbook;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Mural implements Serializable {
    private ArrayList<Usuario> admins;
    private ArrayList<Postagem> postagens ;
    
    public Mural(Usuario user){
        admins = new ArrayList<>();
        admins.add(user);
        postagens = new ArrayList<>();
    }
    
    public ArrayList<Usuario> getAdmins() {
        return admins;
    }
    
    public void addAdmin(Usuario user){
        admins.add(user);
    }
    
    public void removeAdmin(Usuario user){
        admins.remove(user);
    } 
    
    public ArrayList<Postagem> getPostagens() {
        return postagens;
    }
    
    public void addPostagem(Postagem post){
        postagens.add(post);
    }
    
    public void removePostagem(Postagem post){
        postagens.remove(post);
    }
    
    public ArrayList<File> getFotos() {
        ArrayList<File> fotos = new ArrayList<File>();
        
        for(Postagem post : getPostagens()) {
            fotos.add(post.getImagem());
        }
        
        return fotos;
    }
}
