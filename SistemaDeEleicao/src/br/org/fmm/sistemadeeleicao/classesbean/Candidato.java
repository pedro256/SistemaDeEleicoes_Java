package br.org.fmm.sistemadeeleicao.classesbean;

public class Candidato {
    
    private String nome;
    private int numero;
    private int numeroVotos;
    private String caminhoFoto;
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    
    public int getNumeroVotos(){
        return numeroVotos;
    }
    
    public void setNumeroVotos(int numeroVotos){
        this.numeroVotos = numeroVotos;
    }
    
    
    public String getCaminhoFoto(){
        return caminhoFoto;
    }
    
    public void setCaminhoFoto(String caminhoFoto){
        this.caminhoFoto = caminhoFoto;
    }
    
    
}
