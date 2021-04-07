package trabalho_avaliativo;

import java.util.ArrayList;

public class Aluno {
	public String nome, CPF;
	private int qtd;
	private float nota[];
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		System.out.println(this.nome);
	}
	
	public Aluno(String nome, String CPF, int qnt) {
		this.nome = nome;
		this.CPF = CPF;
		this.nota = new float[qnt];
	}
	
	public void setNome(String nome){
	       this.nome = nome;
	    }
	    public String getNome(){
	        return nome;
	    }  
	    public void setCPF(String CPF) {
	        this.CPF = CPF;
	    }
	    public String getCPF(){
	        return CPF;
	    }
	    
	    public int getQtd(){
	        return qtd;
	    }
	    
	    public void setQtd(int qtd){
	        this.qtd = qtd;
	    }
	    
	    public float[] getnota(){
	        return nota;
	    }
	    
	    public void setNota(float[] nota){
	        this.nota = nota;
	    }
	
	public void posicao() {
        for(int i= 0; i<nota.length; i++){
            System.out.println("Passou aqui...");
        }
    }
	
	public void Listar(){
	     System.out.println("Aluno: " + this.nome+"\nCPF: " + this.CPF);
	     for(int i=0; i<nota.length;i++){
	         int j=i+1;
	         System.out.println("Nota " + j + ": " + nota[i]);
	     }
	 }
	
	public void insereNota(float nota, int pos){
        this.nota[pos] = nota;
    }
	
	public float calcularNotas() {
        float soma = 0;
        
        for(int i=0; i<nota.length;i++) {
            soma += nota[i];
        }
        System.out.println("Total: " + soma);
        return soma;
    }
}
