import utils.HTMLGenerator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class SimpleHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        try {

            response.getWriter().write(HTMLGenerator.generateHTML());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){

        try {
            String text = request.getParameter("text");
            String upperText = text.toUpperCase();
            response.getWriter().write(upperText);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}