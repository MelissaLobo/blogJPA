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
@WebServlet(urlPatterns = "/cadastro")
public class CadastrarUsuario extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		GerenciadorDeUsuarios gerenciador = new GerenciadorDeUsuarios();
		gerenciador.cadastrarUsuario(name, email, senha);
		
		directsHtlm(req, resp, "/login.jsp");
	}
}