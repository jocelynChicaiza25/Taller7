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
public class AutoDirector {
    private AutoBuilder builder;
    
    public AutoDirector(AutoBuilder builder){
        this.builder=builder;
    }
    public void ConstruirAuto(){
        builder.definirAuto();
        builder.instalarCarrocería();
        builder.instalarMotor();
        builder.instalarTanque();
    }
    public Auto getAuto(){
        return builder.getAuto();
    }
}
