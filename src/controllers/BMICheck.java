package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BMICheck
 */
@WebServlet("/BMICheck")
public class BMICheck extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMICheck() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //request.setAttribute("_token", request.getSession().getId());

        //request.setAttribute("health", new Health());

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/healths/new.jsp");
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //EntityManager em = DBUtil.createEntityManager();

        //Health h = new Health();

        //String height = request.getParameter("height");
        //h.setHeight(Double.parseDouble(height));
        //String weight = request.getParameter("weight");
        //h.setHeight(Double.parseDouble(weight));

        Double h = Double.parseDouble(request.getParameter("height"));
        Double w = Double.parseDouble(request.getParameter("weight"));
        Double resultBmi = w / (h * h);
        request.setAttribute("resultBmi", resultBmi);

        //em.getTransaction().begin();
        //em.persist(h);
        //em.getTransaction().commit();
        //em.close();

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/healths/create.jsp");
        rd.forward(request, response);
    }

}
