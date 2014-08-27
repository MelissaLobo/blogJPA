package controller;

import static util.Ferramentas.directsHtlm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GerenciadorDeUsuarios;
import model.Usuario;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			
			String email = req.getParameter("email");
			String senha = req.getParameter("senha");

			GerenciadorDeUsuarios gerenciador = new GerenciadorDeUsuarios();
			Usuario usuarioLogado = gerenciador.tentaLogar(email, senha);

			if (usuarioLogado != null) {
				req.getSession().setAttribute("usuarioLogado", usuarioLogado);
				directsHtlm(req, resp, "home.jsp");
			} else {
				req.setAttribute("erro", "usuario ou senha invalida");
				directsHtlm(req, resp, "/login.jsp");
			}
			
		} catch (Exception e) {
			req.setAttribute("erro", e.getMessage());
			directsHtlm(req, resp, "erro.jsp");
		}

	}

}
