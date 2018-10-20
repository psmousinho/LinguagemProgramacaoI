package ufpbook;

import interfaces.TelaPrincipal;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;


public class RedeSocial implements Serializable{

    private HashMap<String, Grupo> grupos;
    private HashMap<String,Usuario> usuarios;

    public RedeSocial() {
        grupos = new HashMap<String, Grupo>();
        usuarios = new HashMap<String, Usuario>();
    }
    
    public Usuario login(String nome, char[] senha) {
       if(usuarios.containsKey(nome)) {
          if(Arrays.equals(getUsuario(nome).getSenha(),senha)) {
              return getUsuario(nome);
          }
       }
           return null;
    } 
    
    public boolean registro(String nome, char[] senha) {
       if(!usuarios.containsKey(nome)) {
           Usuario user = new Usuario(nome, senha);
           usuarios.put(nome, user);
           return true;
       } else {
           return false;
       }
    }
    
    public boolean registroGrupo(Usuario criador, String nome) {
        if(!grupos.containsKey(nome) && !nome.equals("")) {
            Grupo grupo = new Grupo(nome, criador);
            grupos.put(nome, grupo);
            return true;
       } else {
            return false;
       }
   }
    
    public Usuario getUsuario(String nome) {
        return usuarios.get(nome);
    }
    
    public Grupo getGrupo(String nome) {
        return grupos.get(nome);
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }
    
    public HashMap<String, Grupo> getGrupos() {
        return grupos;
    }
    
    public void salvarDados(){
      try
      {
         FileOutputStream fileOut = new FileOutputStream("Dados.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(this);
         out.flush();
         out.close();
         fileOut.close();
      }catch(IOException i)
      {
          i.printStackTrace();
      }
    }

    public static void main(String[] args){
        
        RedeSocial redesocial = new RedeSocial();
        
        File file = new File("Dados.ser");
        if(file.exists()) {
            try {
                FileInputStream fileIn = new FileInputStream("Dados.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                redesocial = (RedeSocial) in.readObject();
                in.close();
                fileIn.close();
            } catch(IOException i)
            {
               i.printStackTrace();
            } catch(ClassNotFoundException i)
            {
               System.out.println("RedeSocial class not found");
               i.printStackTrace();
            }
        }
        
        TelaPrincipal telaprincipal = new TelaPrincipal(redesocial);
        telaprincipal.setVisible(true);
    }
}
