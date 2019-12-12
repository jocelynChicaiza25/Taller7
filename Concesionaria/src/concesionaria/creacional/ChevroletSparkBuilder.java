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
public class ChevroletSparkBuilder {
    private String marca;
    private String modelo;
    private String motor;
    private int almacenamiento;
    private String carroceria;

    public ChevroletSparkBuilder(String marca, String modelo, String motor, int almacenamiento, String carroceria) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.almacenamiento = almacenamiento;
        this.carroceria = carroceria;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    
    
    
}
