package servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicos.ServicoDoBancoDeDados;

@WebServlet("/ExcluirPesquisaServlet")
public class ExcluirPesquisaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ExcluirPesquisaServlet() {
        super();
    }
    
    ServicoDoBancoDeDados servicoBD = new ServicoDoBancoDeDados();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("P_id"));
		servicoBD.deletar(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ListarPesquisas.jsp");
		request.setAttribute("pesquisas",servicoBD.procurarTodos());
		
		rd.forward(request, response);
	}
}
