

package com.mycompany.funciontpi_equipo9;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author amdsa
 */
public class FuncionTPI_equipo9 {
    
    //METODOS STATICOS
    
    public static Object MenuGenerico(List<Optional> Lista){
        
        int opcion= 0;
        for(Optional O:Lista){
         
            System.out.println(opcion+1+"- "+O.getNombre());
            
            
        }
        Scanner scan = new Scanner(System.in);
        scan.nextInt();
        
        return Lista.get(opcion);
        
        
        
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

static List<esspecialidades> construirListaP(List<Problemas> ListaP){
    public List<especialidades> Especialidades;
    for each: ListaP: Problema
        for each: Problema.getespecialidades: especialidad{
            if(!(especialidades.contains(especialidad))){
                Especialidades.add(especialidad);
            }
        }
    return Especialidades;    
    }

static List<esspecialidades> construirListaT(List<Tecnicos> ListaT){
    public List<especialidades> Especialidades;
    for each: ListaT: Tecnico{
        for each: Tecnico.getespecialidades: especialidad{
            if(!(especialidades.contains(especialidad))){
                Especialidades.add(especialidad);
            }
        }
    }
    return Especialidades;    
   }

static void ChequearListas(List <tecnicos> lista, incidente A){
    Lista<Especialidades> EspecialidadesIncidenteP = construirlistaP(A.getProblemas);
    Lista<Especialdiades> especialidades IncidenteT = construirListaT(A.getTecnicos);
   /* for each:EspecialidadesIncidenteP: especialidadP{
        for each:EspecialidadesIncidenteT: EspecialidadT{
            if(especialidadP==especialidadT){
                EspecialidadesIncidenteP.append(especialidadT);
            }
        }
    }*/
    if(false=EspecialidadesIncidenteT.conteinsAll(EspecialidadesIncidenteP)){
        EspecialidadesIncidenteP.removeAll(EspecialidadesIncidenteT);
        System.out.println("quedan"+especialdidadesincidente.P.lenght()+" especialidades sin cubrir y son :");
        for each: EspecialidadesIncidente.p : especialidades{
            system.out.println(especialidades.getnombre());
        }
    }
    
        
  }

//METODO CAMBIAR DE ESTADO ESTADO INICIAL
Estado Cambiarestado(){
    static void ChequearListas(List <tecnicos> lista, List<Problemas> ListaP, List<Tecnicos> ListaT){
    Lista<Especialidades> EspecialidadesIncidenteP = construirlistaP(A.getProblemas);
    Lista<Especialdiades> especialidades IncidenteT = construirListaT(A.getTecnicos);
   /* for each:EspecialidadesIncidenteP: especialidadP{
        for each:EspecialidadesIncidenteT: EspecialidadT{
            if(especialidadP==especialidadT){
                EspecialidadesIncidenteP.append(especialidadT);
            }
        }
    }*/
    if(false=EspecialidadesIncidenteT.conteinsAll(EspecialidadesIncidenteP)){
        EspecialidadesIncidenteP.removeAll(EspecialidadesIncidenteT);
        System.out.println("quedan"+especialdidadesincidente.P.lenght()+" especialidades sin cubrir y son :");
        for each: EspecialidadesIncidente.p : especialidades{
            system.out.println(especialidades.getnombre());
        }
    }
    
        
  }
}
}