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

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author jason
 */
@ManagedBean
@RequestScoped
public class CountryDatesBean {

    public CountryDatesBean() {

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

    public void imagenDestino() {
        CountryDates pais = new CountryDates();
        if (this.paises.equals("Alemania")) {
            imagesAlemania.add(1, "1.jpg");
            imagesAlemania.add(2, "brandenburger-tor-201939_960_720.jpg");
            imagesAlemania.add(3, "city-3378773_960_720.jpg");
            imagesAlemania.add(4, "panorama-2646143_960_720.jpg");
        } else if (this.paises.equals("Estados Unidos")) {
            imagesEEUU.add(1, "water-3046088_960_720.jpg");
            imagesEEUU.add(2, "buildings-668616_960_720.jpg");
            imagesEEUU.add(3, "mount-rushmore-3608620_960_720.jpg");
            imagesEEUU.add(4, "street-690826_960_720 (1).jpg");

        } else if (this.paises.equals("Francia")) {
            imagesFrancia.add(1, "building-102840_960_720.jpg");
            imagesFrancia.add(2, "eiffel-tower-3349075_960_720.jpg");
            imagesFrancia.add(3, "paris-1836415_960_720.jpg");
            imagesFrancia.add(4, "paris-1852928_960_720.jpg");
        } else if (this.paises.equals("España")) {
            imagesEspanya.add(1, "madrid-3021998_960_720.jpg");
            imagesEspanya.add(2, "madrid-5010803_960_720.jpg");
            imagesEspanya.add(3, "mountain-4820681_960_720.jpg");
            imagesEspanya.add(4, "valencia-1049389_960_720.jpg");
        } else if (this.paises.equals("Rusia")) {
            imagesRusia.add(1, "fair-3872942_960_720.jpg");
            imagesRusia.add(2, "moscow-1556561_960_720.jpg");
            imagesRusia.add(3, "moscow-cathedral-mosque-1483524_960_720.jpg");
            imagesRusia.add(4, "the-caucasus-5302236_960_720.jpg");

        }

    }

    public void mensajes() {
        if (this.paises.equals("Alemania")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";
        } else if (this.paises.equals("Estados Unidos")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        } else if (this.paises.equals("Francia")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        } else if (this.paises.equals("España")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        } else if (this.paises.equals("Rusia")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        }
    }

}
