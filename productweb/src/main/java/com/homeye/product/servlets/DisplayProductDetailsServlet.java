package com.homeye.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.homeye.product.bo.ProductBO;
import com.homeye.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		ProductBO productBO = (ProductBO) webApplicationContext.getBean("productbo");
		Product product = productBO.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID: " + product.getId());
		out.print("Product Name: " + product.getName());
		out.print("Product Description: " + product.getDescription());
		out.print("Product Price: " + product.getPrice());
		
	}

}
