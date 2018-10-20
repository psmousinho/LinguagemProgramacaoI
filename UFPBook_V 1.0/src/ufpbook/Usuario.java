package ufpbook;

import java.io.Serializable;

public class Usuario extends Agente implements Serializable {
    
    private char[] senha;
    
    public Usuario(String nome, char[] senha) {
        super(nome);
        this.senha = senha;
        setMural(new Mural(this));
    }
    
    public char[] getSenha() {
        return senha;
    }
}
