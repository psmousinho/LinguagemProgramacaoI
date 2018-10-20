
package ufpbook;

import java.io.Serializable;
import java.util.HashSet;


public class Agente implements Serializable {

    private String nome;
    private String descricao;
    private HashSet<Usuario> pessoas;
    private HashSet<Usuario> solicitacoes;
    private HashSet<Usuario> bloqueados;
    private Mural mural;
    
    public Agente(String nome){
        this.nome = nome;
        descricao = "Nada a declarar.";
        mural = null;
        pessoas = new HashSet<>();
        solicitacoes = new HashSet<>();
        bloqueados = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public HashSet<Usuario> getPessoas() {
        return pessoas;
    }

    public void addPessoa(Usuario pessoas) {
        this.pessoas.add(pessoas);
    }
    
    public void removePessoa(Usuario pessoas) {
        this.pessoas.remove(pessoas);
    }

    public HashSet<Usuario> getSolicitacoes() {
        return solicitacoes;
    }

    public void addSolicitacao(Usuario solicitante ) {
        this.solicitacoes.add(solicitante);
    }
    
    public void removeSolicitacao(Usuario solicitante ) {
        this.solicitacoes.remove(solicitante);
    }
    
    public HashSet<Usuario> getBloqueados() {
        return bloqueados;
    }

    public void addBloqueado(Usuario bloqueado) {
        this.bloqueados.add(bloqueado);
    }
    
    public void removeBloqueado(Usuario bloqueado) {
        this.bloqueados.remove(bloqueado);
    }

    public Mural getMural() {
        return mural;
    }

    public void setMural(Mural mural) {
        this.mural = mural;
    }
    
}
