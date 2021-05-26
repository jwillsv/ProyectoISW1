/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author jason
 */
public class Gastos 
{
    private int gastoPasajes;
    private int gastoHospedaje;
    private List<Integer> recuerdosGasto;
    private List<String> nombreRecuerdo;
    private List<Integer> gastoLugar_Actividad;
    private List<String> nombreLugar_Actividad;
    private List<Integer> valorEquipaje;
    private List<String> integrantes;
    private List<String> tipoVehiculo;

    public int getGastoPasajes() {
        return gastoPasajes;
    }

    public void setGastoPasajes(int gastoPasajes) {
        this.gastoPasajes = gastoPasajes;
    }

    public int getGastoHospedaje() {
        return gastoHospedaje;
    }

    public void setGastoHospedaje(int gastoHospedaje) {
        this.gastoHospedaje = gastoHospedaje;
    }

    public List<Integer> getRecuerdosGasto() {
        return recuerdosGasto;
    }

    public void setRecuerdosGasto(List<Integer> recuerdosGasto) {
        this.recuerdosGasto = recuerdosGasto;
    }

    public List<String> getNombreRecuerdo() {
        return nombreRecuerdo;
    }

    public void setNombreRecuerdo(List<String> nombreRecuerdo) {
        this.nombreRecuerdo = nombreRecuerdo;
    }

    public List<Integer> getGastoLugar_Actividad() {
        return gastoLugar_Actividad;
    }

    public void setGastoLugar_Actividad(List<Integer> gastoLugar_Actividad) {
        this.gastoLugar_Actividad = gastoLugar_Actividad;
    }

    public List<String> getNombreLugar_Actividad() {
        return nombreLugar_Actividad;
    }

    public void setNombreLugar_Actividad(List<String> nombreLugar_Actividad) {
        this.nombreLugar_Actividad = nombreLugar_Actividad;
    }

    public List<Integer> getValorEquipaje() {
        return valorEquipaje;
    }

    public void setValorEquipaje(List<Integer> valorEquipaje) {
        this.valorEquipaje = valorEquipaje;
    }

    public List<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<String> integrantes) {
        this.integrantes = integrantes;
    }

    public List<String> getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(List<String> tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    
    
    
    @Override
    public String toString()
    {
        return this.gastoPasajes +" "+
               this.gastoHospedaje +" "+  
                this.recuerdosGasto +" "+
                this.nombreRecuerdo +" "+
                this.gastoLugar_Actividad +" "+
                this.nombreLugar_Actividad +" "+
                this.valorEquipaje +" "+
                this.integrantes;
               
    }
}
    /*private Long gastoPasajes;
    private Long gastoHospedaje;
    private List<Long> recuerdosGasto;
    private List<String> nombreRecuerdo;
    private List<Long> gastoLugar;
    private List<String> nombreLugar;
    private List<Long> valorEquipaje;
    private List<String> integrantes;*/