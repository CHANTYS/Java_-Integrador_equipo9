/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funciontpi_equipo9;

/**
 *
 * @author amdsa
 */
public class Incidente {
    
    public Estado Estado = new EstadoInicial();
    
    public List<Problemas> ListProblemas;
    public List<Tecnicos> ListTecnicos;
    
}
//CONSTRUIR LISTA DE ESPECIALIDADES DE PROBLEMAS
public List<esspecialidades> construirListaP(List<Problemas> ListaP){
    public List<especialidades> Especialidades;
    for each: ListaP: Problema
        for each: Problema.getespecialidades: especialidad{
            if(!(especialidades.contains(especialidad))){
                Especialidades.add(especialidad);
            }
        }
    return Especialidades;    
    }
//CONSTRUIR LISTA DE ESPECIALIDADES DE TECNICOS
public List<esspecialidades> construirListaT(List<Tecnicos> ListaT){
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
//COMPARAR AMBAS LISTAS DE PROBLEMAS Y TECNICOS
public List<Especialidad> ChequearListas(List<Problemas> Problemas, List<tecnicos> Tecnicos){
    Lista<Especialidades> EspecialidadesIncidenteP = construirlistaP(Problemas);
    Lista<Especialdiades> especialidades IncidenteT = construirListaT(Tecnicos);
   /* for each:EspecialidadesIncidenteP: especialidadP{
        for each:EspecialidadesIncidenteT: EspecialidadT{
            if(especialidadP==especialidadT){
                EspecialidadesIncidenteP.append(especialidadT);
            }
        }
    }*/
    if(false=EspecialidadesIncidenteT.conteinsAll(EspecialidadesIncidenteP)){
        EspecialidadesIncidenteP.removeAll(EspecialidadesIncidenteT);//ELIMINO LO QUE YA EXISTE
        System.out.println("quedan"+especialdidadesincidente.P.lenght()+" especialidades sin cubrir y son :");
        for each: EspecialidadesIncidente.p : especialidades{
            system.out.println(especialidades.getnombre());
        }
    }
    
    if(EspecialidadesIncidenteP.lenght ==0){
        this.Estado = new EstadoPreparacion();
    }    
  }

public void CambiarEstado(){
   List<Especialidades> EspecialidadesSinEncontrar = ChequearListas (this.ListProblemas, this.ListTecnicos);
   
}
