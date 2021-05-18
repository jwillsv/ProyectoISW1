/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.plan;

import dao.CountryDates;
import java.util.Date;
import dao.Paises;
import java.util.List;

/**
 *
 * @author jason
 */
public class CountryDatesBean 
{
    public CountryDatesBean(){
        
    }
   
    private List<String> imagesAlemania;
    private List<String> imagesEEUU;
    private List<String> imagesEspanya;
    private List<String> imagesFrancia;
    private List<String> imagesRusia;
    private Date fechaInicial;
    private Date fechaFinal;
    private String paises;
    private String mensajeAct1;
    private String mensajeAct2;
    private String mensajeAct3;
    private String mensajeAct4;
    private String mensajeAct5;

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    

    public String getMensajeAct1() {
        return mensajeAct1;
    }

    public void setMensajeAct1(String mensajeAct1) {
        this.mensajeAct1 = mensajeAct1;
    }

    public String getMensajeAct2() {
        return mensajeAct2;
    }

    public void setMensajeAct2(String mensajeAct2) {
        this.mensajeAct2 = mensajeAct2;
    }

    public String getMensajeAct3() {
        return mensajeAct3;
    }

    public void setMensajeAct3(String mensajeAct3) {
        this.mensajeAct3 = mensajeAct3;
    }

    public String getMensajeAct4() {
        return mensajeAct4;
    }

    public void setMensajeAct4(String mensajeAct4) {
        this.mensajeAct4 = mensajeAct4;
    }

    public String getMensajeAct5() {
        return mensajeAct5;
    }

    public void setMensajeAct5(String mensajeAct5) {
        this.mensajeAct5 = mensajeAct5;
    }

    public List<String> getImagesAlemania() {
        return imagesAlemania;
    }

    public void setImagesAlemania(List<String> imagesAlemania) {
        this.imagesAlemania = imagesAlemania;
    }

    public List<String> getImagesEEUU() {
        return imagesEEUU;
    }

    public void setImagesEEUU(List<String> imagesEEUU) {
        this.imagesEEUU = imagesEEUU;
    }

    public List<String> getImagesEspanya() {
        return imagesEspanya;
    }

    public void setImagesEspanya(List<String> imagesEspanya) {
        this.imagesEspanya = imagesEspanya;
    }

    public List<String> getImagesFrancia() {
        return imagesFrancia;
    }

    public void setImagesFrancia(List<String> imagesFrancia) {
        this.imagesFrancia = imagesFrancia;
    }

    public List<String> getImagesRusia() {
        return imagesRusia;
    }

    public void setImagesRusia(List<String> imagesRusia) {
        this.imagesRusia = imagesRusia;
    }
    
    
    public void imagenDestino()
    {
        CountryDates pais = new CountryDates();

 
        
        
    }
    
    
    
    

    
    
}
