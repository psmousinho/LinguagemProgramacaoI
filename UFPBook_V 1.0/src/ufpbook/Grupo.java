package ufpbook;

import java.io.Serializable;

public class Grupo extends Agente implements Serializable {
    
    public Grupo(String nome, Usuario criador) {
        super(nome);
        setMural(new Mural(criador));
        addPessoa(criador);
    }
    
}
