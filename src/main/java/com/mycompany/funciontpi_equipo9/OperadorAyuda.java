
package com.mycompany.funciontpi_equipo9;

import java.util.List;
import java.util.Scanner;


/**
 *
 * @author amdsa
 */
public class OperadorAyuda implements Menu {
    
    
    //ABM INCIDENTE
    
    
    //METODO PARA MOSTRAR SERVICIOS DE UN CLIENTE
    
    // CREAR INCIDENTE  ASOCIADO A SERVICIO
    
        // CREAR PROBLEMA ASOCIADO A INCIDENTE ()
    
    //ASIGNAR TECNICO
    
    public void AsignarTecnico(Incidente incidente, List<Tecnicos> PlantaTecnicos ){
        
        List<Tecnicos> TecnicosDisponibles = new ArrayList <Tecnicos>();
        
        TecnicosDisponibles= incidente.BuscarTecnicos(PlantaTecnicos);
        
        
        
        
        
        //IMPLEMENTAR MENU GENERICO DE TECNICOS AQUI
        this.GenerarMenu(TecnicosDisponibles);
        
       
        
        incidente.getListTecnicos().add(this.Seleccionar(TecnicosDisponibles));
       
        
        
    }


    @Override
    public void GenerarMenu(List<Object> Lista) {
        
        int opcion= 0;
        for(Object O:Lista){
         
            
            // ARREGLAR LOS STRING 
            System.out.println(opcion+1 + "- " + O.toString());
            
            
        }
    }

    @Override
    public Object Seleccionar(List<Object> Lista) {
          int opcion= 0;
        
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();
        
        return Lista.get(opcion);
    }

  
       
   

    
    
    
}
