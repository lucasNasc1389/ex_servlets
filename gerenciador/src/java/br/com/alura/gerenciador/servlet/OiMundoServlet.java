/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author User
 */

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws IOException {
       
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("oi mundo, parabens vc escreveu o primeiro servlets.");
        out.println("</body>");
        out.println("</html>");
        
         System.out.println("o servlet OiMundoServlet foi chamado");
    }
    
    
}
