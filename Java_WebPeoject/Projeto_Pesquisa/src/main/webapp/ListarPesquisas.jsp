<%@page import="entidade.Pesquisa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pesquisas</title>
</head>
<body>

	<table>
		<tr>
			<td>#</td>
			<td>Nome</td>
			<td>Email</td>
			<td>Sexo</td>
			<td>Check 1</td>
			<td>Check 2</td>
			<td>Check 3</td>
			<td>Estado Civil</td>
			<td>Açôes</td>
			
		</tr>
		<%
			List<Pesquisa> pesquisas = (List<Pesquisa>) request.getAttribute("pesquisas");
			for(Pesquisa pesquisa : pesquisas){
		%>
		<tr>
			<td><%= pesquisa.getId() %></td>
			<td><%= pesquisa.getNome() %></td>
			<td><%= pesquisa.getEmail() %></td>
			<td><%= pesquisa.getSexo() %></td>
			<td><%= pesquisa.getCheck1() == null ? " - " : pesquisa.getCheck1()%></td>
			<td><%= pesquisa.getCheck2() == null ? " - " : pesquisa.getCheck2()%></td>
			<td><%= pesquisa.getCheck3() == null ? " - " : pesquisa.getCheck3()%></td>
			<td><%= pesquisa.getEstadoCivil() %></td>
			<td><a href="/Projeto_Pesquisa/BuscaPesquisaServlet?P_email=<%=pesquisa.getEmail()%>">Atualizar</a></td>
		</tr>
		<%
			} 
		%>
	</table>

</body>
</html>