package controller;

import static util.Ferramentas.directsHtlm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Blog;
import model.Usuario;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/listaDePostagens")
public class ListaDePostagens extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		try {

			Blog blog = new Blog();
			Usuario usuario = (Usuario) req.getSession().getAttribute(
					"usuarioLogado");

			req.setAttribute("postagens", blog.listaDePostagens(usuario));

			directsHtlm(req, resp, "listaDePostagens.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("erro", e.getMessage());
			directsHtlm(req, resp, "erro.jsp");
		}
	}

}
