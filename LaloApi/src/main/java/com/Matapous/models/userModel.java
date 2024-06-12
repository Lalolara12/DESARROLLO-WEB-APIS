package com.Matapous.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user")

public class userModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String personaje;

    @Column
    private String habilidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getpersonaje() {
        return personaje;
    }

    public void setpersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String gethabilidad() {
        return habilidad;
    }

    public void sethabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}