/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.gerenciador.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucas
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Cadastrando nova empresa");
        PrintWriter out = response.getWriter();
        out.println("<html><body>Empresa cadastrada com sucesso!</body></html>");
        }
    }

    


