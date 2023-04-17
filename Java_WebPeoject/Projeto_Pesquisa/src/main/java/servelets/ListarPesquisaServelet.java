package servelets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Pesquisa;
import servicos.ServicoDoBancoDeDados;


@WebServlet("/ListarPesquisaServelet")
public class ListarPesquisaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private ServicoDoBancoDeDados servicoBd = new ServicoDoBancoDeDados();   
    
    public ListarPesquisaServelet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
				
		RequestDispatcher rd = request.getRequestDispatcher("/ListarPesquisas.jsp");
		request.setAttribute("Pesquisa", servicoBd.procurarTodos());
		
		rd.forward(request, response);
		
	}
}
