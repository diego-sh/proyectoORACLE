/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.distribuidas.proyecto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "CONSUMO_ACTIVIDAD")
public class ConsumoActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private ConsumoActividadPK pk;
    @Column(name = "VALOR", nullable = false, precision = 3, scale = 2)
    private BigDecimal valor;
    @Column(name = "DETALLE", length = 200)
    private String detalle;
    @Column(name = "COD_VISITA")
    private String codigoVisita;
    @Column(name = "COD_ACTIVIDAD")
    private String codigoActividad;

    @JoinColumn(name = "COD_VISITA", referencedColumnName = "COD_VISITA", insertable = false, updatable = false)
    @ManyToOne
    private Visita visita;
    @JoinColumn(name = "COD_ACTIVIDAD", referencedColumnName = "COD_ACTIVIDAD", insertable = false, updatable = false)
    @ManyToOne
    private Actividad actividad;

    public ConsumoActividad() {
    }

    public ConsumoActividad(ConsumoActividadPK consumoActividadPK) {
        this.pk = consumoActividadPK;
    }

    public ConsumoActividadPK getPk() {
        return pk;
    }

    public void setPk(ConsumoActividadPK pk) {
        this.pk = pk;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public String getCodigoVisita() {
        return codigoVisita;
    }

    public void setCodigoVisita(String codigoVisita) {
        this.codigoVisita = codigoVisita;
    }

    public String getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(String codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pk != null ? pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsumoActividad)) {
            return false;
        }
        ConsumoActividad other = (ConsumoActividad) object;
        if ((this.pk == null && other.pk != null) || (this.pk != null && !this.pk.equals(other.pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConsumoActividad{" + "pk=" + pk + '}';
    }

}
