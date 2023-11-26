
package com.mycompany.funciontpi_equipo9;

import java.util.List;

/**
 *
 * @author amdsa
 */
public class EstadoInicial extends Estado{
    
    

    @Override
    public void ProximoEstado(Incidente incidente) {
        
        //CONSTRUIR LISTA DE ESPECIALIDADES DE PROBLEMAS
        
            public List<especialidades> EspecialidadesIncidenteP;
            for (Problema P: incidente.getListProblemas()){
                for (Especialidad E:Problema.getespecialidades()) {
                    if(!(EspecialidadesIncidenteP.contains(E))){
                        EspecialidadesIncidenteP.add(E);
                    }
                }
            }
            public List<especialidades> EspecialidadesIncidenteT;
            for (Tecnico P: incidente.getListTecnicos()){
                for (Especialidad E:Tecnicos.getespecialidades()) {
                    if(!(EspecialidadesIncidenteT.contains(E))){
                        EspecialidadesIncidenteT.add(E);
                    }
                }
            } 
                //COMPARAMOS LISTAS Y CALCULAMOS LA DIFERENCIA
            
            if(false=EspecialidadesIncidenteT.conteinsAll(EspecialidadesIncidenteP)){
                EspecialidadesIncidenteP.removeAll(EspecialidadesIncidenteT);//ELIMINO LO QUE YA EXISTE
                System.out.println("quedan"+EspecialidadesIncidenteP.lenght()+" especialidades sin cubrir y son :");
                for (Especialidad Esp:EspecialidadesIncidenteP) {
                    System.out.println(Esp.getnombre());
                }
            }
            
            
        
        if(EspecialidadesIncidenteP.leght=0){
            
            System.out.println("cambio de estado");
             incidente.CambiarEstado (new EstadoProcesando());
        }else{
            System.out.println("No cambio de estado");
        }
        
       
        
        
    }
    
    
    
}