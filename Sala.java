package trabalho_avaliativo;

import java.util.ArrayList;

public class Sala {
	Aluno aluno;
    ArrayList<Aluno> lstAlunos;
    
    public Sala(){
        lstAlunos = new ArrayList<Aluno>();
    }
    
    public void inserirAluno(Aluno aluno){
        lstAlunos.add(aluno);
    }
    
    public void ListarTodos(){
        for(Aluno aluno:lstAlunos) {
            aluno.Listar();
            aluno.calcularNotas();
        }
    }
}
