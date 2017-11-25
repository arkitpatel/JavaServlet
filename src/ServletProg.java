import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Arkit on 25-Nov-17.
 */
public class ServletProg extends javax.servlet.http.HttpServlet {

    public void init() throws ServletException {
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Program 2</title>");
        out.println("<style>\n" +
                "table {\n" +
                "    font-family: arial, sans-serif;\n" +
                "    border-collapse: collapse;\n" +
                "    width: 100%;\n" +
                "}\n" +
                "\n" +
                "td {\n" +
                "    border: 1px solid #dddddd;\n" +
                "    text-align: left;\n" +
                "    padding: 8px;\n" +
                "}\n" +
                "\n" +
                "tr:nth-child(even) {\n" +
                "    background-color: #dddddd;\n" +
                "}\n" +
                "</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        for(int i=0; i<25; i++){
            out.println("<tr>");
            for (int j=0; j<10; j++){
                out.println("<td> Row " + (i+1) + ", Col " + (j+1) + "</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
