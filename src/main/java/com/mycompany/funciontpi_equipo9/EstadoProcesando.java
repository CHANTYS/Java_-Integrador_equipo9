
package com.mycompany.funciontpi_equipo9;

/**
 *
 * @author amdsa
 */
public class EstadoProcesando extends Estado{

    @Override
    public void ProximoEstado(Incidente incidente) {
       
        incidente.SiguienteEstdo(new EstadoFinalizado());
    }
    
}
