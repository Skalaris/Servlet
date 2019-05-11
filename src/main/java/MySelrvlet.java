
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MySelrvlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Coś");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String lastname = req.getParameter("lastname");
        String name = req.getParameter("name");
        Cookie cookie = new Cookie("Liralen","3");
        out.println("Hello World from maven new me2!"+name+" "+lastname);
       //resp.sendRedirect(req.getContextPath()+"/anotherServlet");
        //getServletContext().getRequestDispatcher("/anotherServlet").forward(req,resp);
        //getServletContext().getRequestDispatcher("/anotherServlet").include(req,resp);
    }
}
