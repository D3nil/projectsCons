package controller;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

@WebServlet("/Control")


public class ServletOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/hmtl;charset:utf-8");
		//PrintWriter out=response.getWriter();
		//String action=request.getParameter("action");
		String pIva=request.getParameter("txtPIVA");
		String action=request.getParameter("action");
		System.out.println("action => "+action);
		System.out.println("partita iva => "+pIva);
		//String pIva="09668910012";
		switch (action) {
		
		case "showLogin":
			showLogin(request,response);
			break;
		
		case "showForgot":
			showForgot(request, response);
			break;
			
		case "showRegister":
			showRegister(request, response);
			break;
			
		case "showProvider":
			break;
			
		case "showAdminprovider":
			showProvider(request, response, pIva);
			break;
		default:
			break;
			}
//		}
//		
//		
//		Fornitori fornitore=null;
//		
//		Dao_Fornitori d=new Dao_Fornitori();
//		try {
//				fornitore=d.getFornitore(pIva);
//				//System.out.println(fornitore);
//				if(fornitore!=null)		//se il fornitore viene creato e cioè esiste allora :		
//				{
//					List<Fornitori> lista=new ArrayList<>();
//					lista.add(fornitore);
//					request.setAttribute("lista", lista);
//					RequestDispatcher myDisp=request.getRequestDispatcher("/ViewFornitore.jsp");
//					myDisp.forward(request, response);
//				}
//					else {
//							response.sendRedirect("index.jsp?msg=Error");
//						 }
//			} 
//							catch (Exception e) 
//							{System.out.println(" errore Servlet qui");
//							e.printStackTrace();
//							e.getMessage();}
//		

	}
private void showForgot(HttpServletRequest request, HttpServletResponse response) throws ServletException {
	try {
		RequestDispatcher myreq= request.getRequestDispatcher("/forgotPass.jsp");
		myreq.forward(request, response);
	} catch (IOException e) 
	{
	System.out.println("forgotpass ERRRRRORRRRR");
	e.getMessage();
		e.printStackTrace();
	}	
}

protected void showIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException 
{
	try {
		RequestDispatcher myreq= request.getRequestDispatcher("/index.jsp");
		myreq.forward(request, response);
	} catch (IOException e) 
	{
	System.out.println("showindex ERRRRRORRRRR");
	e.getMessage();
		e.printStackTrace();
	}
}

protected void showLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException 
{
	try {
		RequestDispatcher myreq= request.getRequestDispatcher("/index.jsp");
		myreq.forward(request, response);
	} catch (IOException e) 
	{
	System.out.println("showindex ERRRRRORRRRR");
	e.getMessage();
		e.printStackTrace();
	} 
}

protected void showProvider(HttpServletRequest request, HttpServletResponse response, String Iva) 
{
	Fornitori fornitore=null;
	
	
	Dao_Fornitori d=new Dao_Fornitori();
	try {
			PrintWriter out=response.getWriter();
			fornitore=d.getFornitore(Iva);
			System.out.println(fornitore);
			if(fornitore!=null)		//se il fornitore viene creato e cioè esiste allora :		
			{
				List<Fornitori> lista=new ArrayList<>();
				lista.add(fornitore);
				request.setAttribute("lista", lista);
				RequestDispatcher myDisp=request.getRequestDispatcher("/ViewFornitore.jsp");
				myDisp.forward(request, response);
			}
				else {response.sendRedirect("index.jsp?error=true");
					 }
			out.println("fornitore vuoto ="+fornitore!=null);
		}
						catch (Exception e) 
						{System.out.println(" errore Servlet qui");
						e.printStackTrace();
						e.getMessage();}
	

}

protected void showRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException 
{
	try {
		RequestDispatcher myreq= request.getRequestDispatcher("/registration.jsp");
		myreq.forward(request, response);
	} catch (IOException e) 
	{
	System.out.println("showindex ERRRRRORRRRR");
	e.getMessage();
		e.printStackTrace();
	} 
}


}

  


