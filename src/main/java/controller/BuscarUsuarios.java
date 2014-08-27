package controller;

import static util.Ferramentas.directsHtlm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GerenciadorDeUsuarios;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/usuarios")
public class BuscarUsuarios extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		GerenciadorDeUsuarios gerenciador = new GerenciadorDeUsuarios();
		req.setAttribute("usuarios", gerenciador.listaDeUsuarios());
		
		directsHtlm(req, resp, "/usuarios.jsp");
	}

}
