package dao;

import web.plan.*;

public enum Paises {
    AFGANISTAN("Afganistan"),
    ALBANIA("Albania"),
    ALEMANIA("Alemania"),
    ANDORRA("Andorra"),
    ANGOLA("Angola"),
    ESTADOS_UNIDOS("Estados Unidos"),
    ESLOVAQUIA("Eslovaquia"),
    ESTAMBUL("Estambul"),
    ESPANYA("España"),
    EGIPTO("Egipto"),
    FRANCIA("Francia"),
    FINLANDIA("Finlandia"),
    ITALIA("Italia"),
    INDIA("India"),
    REINO_UNIDO("Reino Unido"),
    REP_CHECA("Rep checa"),
    RUMANIA("Rumania"),
    RUANDA("Ruanda"),
    RUSIA("Rusia"),
    SUIZA("Suiza");

    private String pais;

    Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
  /*
    
    
    */
}
