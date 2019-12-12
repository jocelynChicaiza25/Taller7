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
public abstract class AutoBuilder {
    
    protected Auto a;
    
    public Auto getAuto(){
        return a;
    }
    public abstract void definirComputador();
    public abstract void instalarCarrocería();
    public abstract void instalarMotor();
    public abstract void instalarTanque();
    //aqui valores que añada al auto
    
    
}
