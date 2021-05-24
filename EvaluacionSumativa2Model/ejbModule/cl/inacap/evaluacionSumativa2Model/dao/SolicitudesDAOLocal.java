package cl.inacap.evaluacionSumativa2Model.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.evaluacionSumativa2Model.dto.Solicitud;

@Local
public interface SolicitudesDAOLocal {
	void save(Solicitud solicitud);
	List<Solicitud> getAll();
	void delete(Solicitud solicitud);
}
