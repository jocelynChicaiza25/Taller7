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
public class ChevroletSailBuilder extends AutoBuilder{
    
    @Override
    public void definirAuto() {
        a=new Auto();
        a.setMarca("Chevrolet");
        a.setModelo("Sail");
        
    }

    @Override
    public void instalarCarrocería() {
        a.setCarroceria(new Carroceria());
        a.getCarroceria().setSerie("1J23KO23");
    }

    @Override
    public void instalarMotor() {
        a.setMotor(new Motor());
        a.getMotor().setNumero(1.4);
    }

    @Override
    public void instalarTanque() {
        a.setTanque(new Tanque());
        a.getTanque().setAlmacenamiento("1000 lb");
    }
    
}
