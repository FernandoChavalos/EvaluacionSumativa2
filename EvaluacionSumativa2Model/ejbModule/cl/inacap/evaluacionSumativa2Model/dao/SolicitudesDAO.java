package cl.inacap.evaluacionSumativa2Model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.evaluacionSumativa2Model.dto.Solicitud;

/**
 * Session Bean implementation class SolicitudesDAO
 */
@Stateless
@LocalBean
public class SolicitudesDAO implements SolicitudesDAOLocal {
	private static List<Solicitud> solicitudes = new ArrayList<Solicitud>();
    /**
     * Default constructor. 
     */
    public SolicitudesDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Solicitud solicitud) {
		// TODO Auto-generated method stub
		solicitudes.add(solicitud);
	}

	@Override
	public List<Solicitud> getAll() {
		// TODO Auto-generated method stub
		return solicitudes;
	}

	@Override
	public void delete(Solicitud solicitud) {
		// TODO Auto-generated method stub
		solicitudes.remove(solicitud);
	}

}
