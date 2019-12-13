/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria.creacional;

/**
 *
 * @author cajas
 */
public class Auto {
    private String Marca;
    private String Modelo;
    private Motor motor;
    private Tanque tanque;
    private Carroceria carroceria;

    public Auto(String Marca, String Modelo, Motor motor, Tanque tanque, Carroceria carroceria) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.motor = motor;
        this.tanque = tanque;
        this.carroceria = carroceria;
    }
    
    

    public Auto() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    
    
    
    
}
