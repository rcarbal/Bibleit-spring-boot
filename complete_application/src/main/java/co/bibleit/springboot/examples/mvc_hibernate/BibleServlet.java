package co.bibleit.springboot.examples.mvc_hibernate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

// File not functioning/implemented

@WebServlet("/BibleitServlet")
public class BibleServlet extends HttpServlet {

    private static final long serialVersionUID = 1l;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Served at: ").append(req.getContextPath());

        String jdbcUrl = "jdbc:mysql://localhost:3306/bible_it?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "2Qepxniw";
        String driver = "com.mysql.jdbc.Driver";



        try{

            PrintWriter out = resp.getWriter();
            out.println("Connection to database: " + jdbcUrl);

            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);

            out.println("SUCCESS!!!");
            myConn.close();

        }
        catch (Exception e){
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
