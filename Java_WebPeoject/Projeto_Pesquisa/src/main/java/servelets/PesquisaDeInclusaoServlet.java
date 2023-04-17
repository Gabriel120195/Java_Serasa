package servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Pesquisa;
import servicos.ServicoDoBancoDeDados;


@WebServlet("/PesquisaDeInclusaoServlet")
public class PesquisaDeInclusaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private ServicoDoBancoDeDados servicoBd = new ServicoDoBancoDeDados();   
    
    public PesquisaDeInclusaoServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Pesquisa pesquisa = new Pesquisa();
		pesquisa.setNome(request.getParameter("P_nome"));
		pesquisa.setEmail(request.getParameter("P_email"));
		pesquisa.setSexo(request.getParameter("P_sexo"));
		pesquisa.setCheck1(request.getParameter("P_ck1"));
		pesquisa.setCheck2(request.getParameter("P_ck2"));
		pesquisa.setCheck3(request.getParameter("P_ck3"));
		pesquisa.setEstadoCivil(request.getParameter("P_estadoCivil"));
		
		Pesquisa pesquisaSalva =  servicoBd.salvar(pesquisa);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ListarPesquisas.jsp");
		request.setAttribute("pesquisas", servicoBd.procurarTodos());
		
		rd.forward(request, response);
		
	}
}
