package com.api.equipamento.model;

import org.springframework.stereotype.Component;

@Component
public class Mensage {
    private String mensage;

    public String getMensage(){
        return mensage;
    }

    public void setMensage(String mensage){
        this.mensage = mensage;
    }
}
