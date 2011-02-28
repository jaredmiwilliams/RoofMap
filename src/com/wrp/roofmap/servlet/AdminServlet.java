package com.wrp.roofmap.servlet;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wrp.roofmap.geocode.GoogleConnect;
import com.wrp.roofmap.geocode.YahooConnect;
import com.wrp.roofmap.model.AdminSettings;
import com.wrp.roofmap.model.Point;
import com.wrp.roofmap.util.Controller;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Controller controller = null;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
	}

    public AdminServlet() {
    	controller = Controller.getInstance();
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
				request.setAttribute("AdminSettings", controller.getAdminSettings());
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
		//
	}

	private void doEdit(HttpServletRequest request, HttpServletResponse response) {
		//
	}

	private void doSettings(HttpServletRequest request,	HttpServletResponse response) throws ServletException, IOException {
		String address = request.getParameter("starting_address");
		String zoom = request.getParameter("default_zoom");
		
		GoogleConnect yConnect = new GoogleConnect();
		Point point = null;
		
		try {
			point = yConnect.doParsing(address);
		}
		catch (Exception e) {
			request.setAttribute("error", "There was a problem geocoding the address");
			request.setAttribute("AdminSettings", new AdminSettings(address, "", "", zoom));
			this.getServletContext().getRequestDispatcher("/jsp/admin/settings.jsp").forward(request, response);
			return;
		}
		
		try {
			Controller.getConnect().deleteObjects(AdminSettings.class);
		} catch (Exception e) {
			//TODO handle this error
			e.printStackTrace();
		}
		
		AdminSettings settings = new AdminSettings(address, point.lat + "", point.lon + "", zoom);
		
		if(controller.addAdminSettings(settings)) {
			request.setAttribute("message", "Settings saved");
		}
		else {
			request.setAttribute("error", "There was a problem saving the settings");
		}
		
		request.setAttribute("AdminSettings", settings);
		
		this.getServletContext().getRequestDispatcher("/jsp/admin/settings.jsp").forward(request, response);
	}

	private void doAdd(HttpServletRequest request, HttpServletResponse response) {
		//
	}

}
