package cl.inacap.evaluacionSumativa2Web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IngresarSolicitudController
 */
@WebServlet("/IngresarSolicitudController.do")
public class IngresarSolicitudController extends HttpServlet {
	private static AtomicInteger i;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IngresarSolicitudController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/IngresarSolicitud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> fallos = new ArrayList<>();
		int numeroSolicitud = i.incrementAndGet();
		String rut = request.getParameter("rut-txt");
		if (rut.isEmpty()) {
			fallos.add("Debe ingresar un rut");
		}else {
			try {
			if (validarRut(rut) == false) {
				fallos.add("Rut no valido");
			}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String nombre = request.getParameter("nombre-txt");
		if (nombre.isEmpty()) {
			fallos.add("Debe ingresar un nombre");
		}
		String tipoSolicitud = request.getParameter("marca-select");
		int tipo = 0;
		try {
			tipo = Integer.parseInt(tipoSolicitud);
		} catch (Exception ex) {
			fallos.add("No se ha seleccionado correctamente el tipo");
			// TODO: handle exception
		}
		if (fallos.isEmpty()) {
			request.setAttribute("mensaje", "Solicitud registrada correctamente");
		}else {
			request.setAttribute("Errores", fallos);
		}
		
		
		
		
		
		
		
	}
	public static boolean validarRut(String rut) {

	    boolean validacion = false;
	    try {
	        rut =  rut.toUpperCase();
	        rut = rut.replace(".", "");
	        rut = rut.replace("-", "");
	        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

	        char dv = rut.charAt(rut.length() - 1);

	        int m = 0, s = 1;
	        for (; rutAux != 0; rutAux /= 10) {
	            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
	        }
	        if (dv == (char) (s != 0 ? s + 47 : 75)) {
	            validacion = true;
	        }

	    } catch (java.lang.NumberFormatException e) {
	    } catch (Exception e) {
	    }
	    return validacion;
	}
}
