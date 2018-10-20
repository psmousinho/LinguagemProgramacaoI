package ufpbook;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;


public class Postagem extends Comentario implements Serializable {
    private File imagem;
    private boolean visibilidade;
    
    public Postagem(Usuario autor, String texto, File imagem, boolean visibilidade) {
        super(autor,texto);
        this.imagem = imagem;
        this.visibilidade = visibilidade;
    }
  
    public File getImagem() {
        return imagem;
    }

    public boolean isVisibilidade() {
        return visibilidade;
    }
}
