package dao;

import java.util.List;

public class GastosReales 
{
    private int gastoPasajeReal;
    private int gastoHospedajeReal;
    private List<Integer> gastoRecuerdosReal;
    private List<Integer> gastoLugar_ActividadReal;
    private List<Integer> valorEquipajeReal;

    public int getGastoPasajeReal() {
        return gastoPasajeReal;
    }

    public void setGastoPasajeReal(int gastoPasajeReal) {
        this.gastoPasajeReal = gastoPasajeReal;
    }

    public int getGastoHospedajeReal() {
        return gastoHospedajeReal;
    }

    public void setGastoHospedajeReal(int gastoHospedajeReal) {
        this.gastoHospedajeReal = gastoHospedajeReal;
    }

    public List<Integer> getGastoRecuerdosReal() {
        return gastoRecuerdosReal;
    }

    public void setGastoRecuerdosReal(List<Integer> gastoRecuerdosReal) {
        this.gastoRecuerdosReal = gastoRecuerdosReal;
    }

    public List<Integer> getGastoLugar_ActividadReal() {
        return gastoLugar_ActividadReal;
    }

    public void setGastoLugar_ActividadReal(List<Integer> gastoLugar_ActividadReal) {
        this.gastoLugar_ActividadReal = gastoLugar_ActividadReal;
    }

    public List<Integer> getValorEquipajeReal() {
        return valorEquipajeReal;
    }

    public void setValorEquipajeReal(List<Integer> valorEquipajeReal) {
        this.valorEquipajeReal = valorEquipajeReal;
    }
    
    @Override
    public String toString()
    {
        return this.gastoPasajeReal +" "+
               this.gastoHospedajeReal +" "+
               this.gastoRecuerdosReal +" "+ 
               this.gastoLugar_ActividadReal +" "+              
               this.valorEquipajeReal;
               
               
    }
    
}
