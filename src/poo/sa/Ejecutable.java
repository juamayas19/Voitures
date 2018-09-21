/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.sa;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Juan Camilo
 */
public class Ejecutable {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        ArrayList<Voiture> carros = new ArrayList<Voiture>();
        System.out.println("Put there your name");
        String name = read.nextLine();        
        System.out.println("Hi, "+ name);
        Roue roues[]=new Roue[4];
        Chassis chassis = new Chassis();
        Moteur moteur = new Moteur();
        int serial=0;
        Personne propietario1 = new Personne(name, carros);
        carros.add(new Voiture(serial, roues,chassis,moteur));
        propietario1.setVoiture(carros);
        
        
        
    }
    
}
