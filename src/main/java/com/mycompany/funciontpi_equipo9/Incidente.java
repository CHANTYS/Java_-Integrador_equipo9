
package com.mycompany.funciontpi_equipo9;

import java.util.List;

/**
 *
 * @author amdsa
 */
public class Incidente {
    
    public Estado estado = new EstadoInicial();
    
    public List<Problemas> ListProblemas;
    
    public List<Tecnico> ListTecnicos;
    
    
    
    

    public List<Problemas> getListProblemas() {
        return ListProblemas;
    }
    
    
    

    public List<Tecnico> getListTecnicos() {
        return ListTecnicos;
    }

    
  

    
    public void setListProblemas(<any> ListProblemas) {
        this.ListProblemas = ListProblemas;
    }

    public <any> getListTecnicos() {
        return ListTecnicos;
    }

    public void setListTecnicos(<any> ListTecnicos) {
        this.ListTecnicos = ListTecnicos;
    }
    

    public Estado getEstado() {
        return estado;
    }

    public <any> getListProblemas() {
        return ListProblemas;
    }

   
    
    

    void SiguienteEstado(EstadoProcesando estadoProcesando) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void CambiarEstado(Estado estado){
    
    this.estado=estado;

    
}

public void SiguienteEstado(){
    this.Estado.ProximoEstado(this);
    
    
}
    
    
    
    //METODOS
    public List<Tecnico> BuscarTecnicos(List<Tecnico> LTecnicos){
        List<Especialidad> ListaEP = new ArrayList<Especialidad>();
        for(Problema P:this.ListaProblemas){
            for(Especialidad E:P.getEspecialidades()){
                if(!ListaEP.contains(E)){
                    ListaEP.add(E);
                }
            }
        }
        List<Tecnico> TecnicosEncontrados = new ArrayList<Tecnico>();
        
        for(Tecnico T:LTecnicos){
            for(Especialidad Esp:T.getEspecialidades()){
                if(ListaEP.contains(Esp)){
                    TecnicosEncontrados.add(T);
                }
            }
        }
        
            
        return TecnicosEncontrados;
    }
    
    
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

/*
public void CambiarEstado(){
   List<Especialidades> EspecialidadesSinEncontrar = ChequearListas (this.ListProblemas, this.ListTecnicos);
   
}




*/


