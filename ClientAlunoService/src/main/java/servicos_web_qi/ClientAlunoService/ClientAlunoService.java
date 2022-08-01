package servicos_web_qi.ClientAlunoService;


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;

public class ClientAlunoService {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/AlunoService/getAlunos");

		Invocation.Builder invocation = target.request();
		
		Response response = invocation.get();
		
		System.out.println(response.readEntity(String.class));
		
	}
	
}
