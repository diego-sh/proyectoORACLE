/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.centrocostero.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import ec.edu.espe.centrocostero.model.ConsumoActividad;
import ec.edu.espe.centrocostero.model.ConsumoActividadPK;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Daniel
 */
@LocalBean
@Stateless
public class ConsumoActividadDAO extends DefaultGenericDAOImple<ConsumoActividad, ConsumoActividadPK> {

    public ConsumoActividadDAO() {
        super(ConsumoActividad.class);
    }
}
