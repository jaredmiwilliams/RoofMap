package com.wrp.roofmap.servlet;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		StringTokenizer st = new StringTokenizer(uri, "/");
		
		st.nextElement();//WhiteRoofProject
		st.nextElement();//admin
		
		if(st.hasMoreElements()) {
			String command = st.nextToken();
			
			if(command.equals("add")) {
				this.getServletContext().getRequestDispatcher("/jsp/admin/add.jsp").forward(request, response);
			}
			else if(command.equals("settings")) {
				//TODO load settings object
				this.getServletContext().getRequestDispatcher("/jsp/admin/settings.jsp").forward(request, response);
			}
			else if(command.equals("edit")) {
				//TODO load map entry or send error
			}
			else if(command.equals("map")) {
				//TODO redirect to map
			}
			else if(command.equals("login")) {
				this.getServletContext().getRequestDispatcher("/jsp/admin/login.jsp").forward(request, response);
			}
			else if(command.equals("logout")) {
				//TODO logout
			}
			else {
				this.getServletContext().getRequestDispatcher("/jsp/admin/control.jsp").forward(request, response);
			}
		}
		else {
			this.getServletContext().getRequestDispatcher("/jsp/admin/control.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();

		StringTokenizer st = new StringTokenizer(uri, "/");
		
		st.nextElement();//WhiteRoofProject
		st.nextElement();//admin
		
		if(st.hasMoreElements()) {
			String command = st.nextToken();
			
			if(command.equals("add")) {
				doAdd(request, response);
			}
			else if(command.equals("settings")) {
				doSettings(request, response);
			}
			else if(command.equals("edit")) {
				doEdit(request, response);
			}
			else if(command.equals("login")) {
				doLogin(request, response);
			}
			else {
				this.getServletContext().getRequestDispatcher("/jsp/admin/control.jsp").forward(request, response);
			}
		}
		else {
			this.getServletContext().getRequestDispatcher("/jsp/admin/control.jsp").forward(request, response);
		}
	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void doEdit(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void doSettings(HttpServletRequest request,	HttpServletResponse response) {
		
	}

	private void doAdd(HttpServletRequest request, HttpServletResponse response) {
		
	}

}
