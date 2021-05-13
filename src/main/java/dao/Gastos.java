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
    private Long gastoPasajes;
    private Long gastoHospedaje;
    private List<Long> recuerdosGasto;
    private List<String> nombreRecuerdo;
    private List<Long> gastoLugar;
    private List<String> nombreLugar;
    private List<Long> valorEquipaje;
    private List<String> integrantes;
    private List<String> tipoVehiculo;

    public Long getGastoPasajes() {
        return gastoPasajes;
    }

    public void setGastoPasajes(Long gastoPasajes) {
        this.gastoPasajes = gastoPasajes;
    }

    public Long getGastoHospedaje() {
        return gastoHospedaje;
    }

    public void setGastoHospedaje(Long gastoHospedaje) {
        this.gastoHospedaje = gastoHospedaje;
    }

    public List<Long> getRecuerdosGasto() {
        return recuerdosGasto;
    }

    public void setRecuerdosGasto(List<Long> recuerdosGasto) {
        this.recuerdosGasto = recuerdosGasto;
    }

    public List<String> getNombreRecuerdo() {
        return nombreRecuerdo;
    }

    public void setNombreRecuerdo(List<String> nombreRecuerdo) {
        this.nombreRecuerdo = nombreRecuerdo;
    }

    public List<Long> getGastoLugar() {
        return gastoLugar;
    }

    public void setGastoLugar(List<Long> gastoLugar) {
        this.gastoLugar = gastoLugar;
    }

    public List<String> getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(List<String> nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public List<Long> getValorEquipaje() {
        return valorEquipaje;
    }

    public void setValorEquipaje(List<Long> valorEquipaje) {
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
                this.gastoLugar +" "+
                this.nombreLugar +" "+
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