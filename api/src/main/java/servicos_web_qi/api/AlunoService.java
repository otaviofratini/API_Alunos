package servicos_web_qi.api;
import java.util.ArrayList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("AlunoService")
public class AlunoService {
	ArrayList<Aluno> listaAluno;	
	
	public AlunoService() {
		listaAluno = new ArrayList<Aluno>();
		listaAluno.add(new Aluno(0, "Marcelo Bastos", "marcelo@email.com", 1));
		listaAluno.add(new Aluno(1, "Lucas Silva e Silva", "lucas@email.com", 2));
		listaAluno.add(new Aluno(2, "Fernando Campos", "fernando@email.com", 2));
		listaAluno.add(new Aluno(3, "Rafael Machado", "rafael@email.com", 1));
		listaAluno.add(new Aluno(4, "Roberto Assis", "robert@email.com", 3 ));
	}
	
	
		@GET
		@Path("getAlunos")
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Aluno> getAlunos() {
			
			return listaAluno;
		}
		
		@GET
		@Path("getAlunosById/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public Aluno getAlunosById(@PathParam("id") int id) {
			for(Aluno aluno : listaAluno) {
				if(aluno.getId() == id) {
					return aluno;
				}
			}
			
			return null;
		}
		
}
