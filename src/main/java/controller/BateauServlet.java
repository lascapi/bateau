package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.BateauRepo;

/**
 * Servlet implementation class BateauServlet
 */
@WebServlet("/bateaux")
public class BateauServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BateauServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> bateaux = BateauRepo.findAll();
		String listeDeBateau = "<ul>";
		for (String bateau : bateaux) {
			listeDeBateau = listeDeBateau + "<li>" + bateau + "</li>";
		}
		listeDeBateau = listeDeBateau + "</ul>";
		response.getWriter()
			.append("<div><a href='/bateau/'>up</a></div>")
			.append("<div><h2>Bateau(x)</h2> ")
			.append(listeDeBateau)
			.append("</div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
