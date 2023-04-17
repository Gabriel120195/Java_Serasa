<%@page import="entidade.Pesquisa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados da pesquisa</title>
</head>
<body>
	<h1>Dados para pesquisa</h1>
	<form action="/Projeto_Pesquisa/PesquisaAtualizarServlet" method="post">
	
	<%Pesquisa pesquisa = (Pesquisa) request.getAttribute("pesquisa");%>
		
	<input type="hidden" name="P_id" value="<%= pesquisa.getId() %>" />
	<p>ID:<input type="text" name="P_id" size="30" disabled value="<%= pesquisa.getId() %>" /></p>	
	
	<p>Nome: <input type="text" name="P_nome" size="30" value="<%= pesquisa.getNome() %>" /></p>
	<p>Email: <input type="email" name="P_email" size="30" value="<%= pesquisa.getEmail() %>" /></p>
	
	<p>Sexo</p>
	<p>Masculino <input type="radio" name="P_sexo" value="masculino" checked="<%= pesquisa.getSexo().equals("masculino") %>" /></p>
	<p>Feminino <input type="radio" name="P_sexo" value="feminino" checked="<%= pesquisa.getSexo().equals("feminino") %>" /></p>
	
	<p>Tipos de filmes preferidos</p>
	<p><input type="checkbox" name="P_ck1" value="romance" <%= pesquisa.getCheck1() != null ? "checked" : "" %> />Romance</p>
	<p><input type="checkbox" name="P_ck2" value="ficção" <%= pesquisa.getCheck2() != null ? "checked" : "" %> />Ficção</p>
	<p><input type="checkbox" name="P_ck3" value="aventura" <%= pesquisa.getCheck3() != null ? "checked" : "" %> />Aventura</p>
	
	<p>Estado Civil</p>
	<select name="P_estadoCivil">
		<option value="solteiro(a)" <%= pesquisa.getEstadoCivil().equals("solteiro(a)") ? "selected" : "" %> >Solteiro(a)</option>
		<option value="casado(a)" <%= pesquisa.getEstadoCivil().equals("casado(a)") ? "selected" : "" %> >Casado(a)</option>
		<option value="viuvo(a)" <%= pesquisa.getEstadoCivil().equals("viuvo(a)") ? "selected" : "" %> >Viuvo(a)</option>
	</select>
	
	<p>
		<a href="/Projeto_Pesquisa/ExcluirPesquisaServlet?P_id=<%= pesquisa.getId() %>">Excluir Registro</a>
	</p>
	
	<p>
		<input type="submit" value="enviar" />
		<input type="reset" value="limpar" />
	</p>
	
	</form>
</body>
</html>