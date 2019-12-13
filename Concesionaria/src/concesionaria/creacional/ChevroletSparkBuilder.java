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
public class ChevroletSparkBuilder extends AutoBuilder{

    @Override
    public void definirAuto() {
        a=new Auto();
        a.setMarca("Chevrolet");
        a.setModelo("Spark");
    }

    @Override
    public void instalarCarrocería() {
        a.setCarroceria(new Carroceria());
        a.getCarroceria().setSerie("JWE9EWF8");
    }

    @Override
    public void instalarMotor() {
        a.setMotor(new Motor());
        a.getMotor().setNumero(1.2);
    }

    @Override
    public void instalarTanque() {
        a.setTanque(new Tanque());
        a.getTanque().setAlmacenamiento("500 lb");
    }
   
    
    
    
}
