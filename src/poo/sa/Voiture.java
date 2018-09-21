/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.sa;
import java.util.ArrayList;
/**
 *
 * @author Juan Camilo
 */
public class Voiture {
    private int serial;
    private Roue ruedas []= new Roue [4];
    private Chassis chasis;
    private Moteur motor;
    public Voiture (int nombre, Roue[] ruedas, Chassis chasis, Moteur motor){
        this.serial=nombre;
        this.ruedas=ruedas;
        this.chasis=chasis;
        this.motor=motor;
    }

    public void setNombre(int nombre) {
        this.serial = nombre;
    }

    public void setRuedas(Roue[] ruedas) {
        for (int i = 0; i < 4; i++) {
            this.ruedas[i] = ruedas[i];
        }
        
    }

    public void setChasis(Chassis chasis) {
        this.chasis = chasis;
    }

    public void setMotor(Moteur motor) {
        this.motor = motor;
    }

    public int getNombre() {
        return serial;
    }

    public Roue[] getRuedas() {
        return ruedas;
    }

    public Chassis getChasis() {
        return chasis;
    }

    public Moteur getMotor() {
        return motor;
    }
    
}
