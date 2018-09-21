/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.sa;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Juan Camilo
 */
public class Personne {
    Scanner lit = new Scanner(System.in);
    private String name;
    private ArrayList<Voiture> voitures;

    public Personne(String name, ArrayList<Voiture> voitures) {
        this.name = name;
        this.voitures = voitures;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Voiture> getVoitures() {
        return voitures;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoitures(ArrayList<Voiture> voitures) {
        this.voitures = voitures;
    }
    public Voiture getVoiture(ArrayList<Voiture> petite_Voiture){
        System.out.println("Choisir la voiture serial de la personne");
        int numero = lit.nextInt();
        System.out.println(petite_Voiture.get(numero).getRuedas());
        return null;
    }
    public  void setVoiture( ArrayList<Voiture> carro){
        System.out.println("Which car do you want to set");
        int serial = lit.nextInt();
        Roue wheels[]= new Roue[4];
        System.out.println("Choose your wheels size");
        int size=lit.nextInt();
        for (int i = 0; i < 4; i++) {
            wheels[i].setSize(size);
        }
        Chassis chassis = new Chassis();
        System.out.println("Choose your chasis color");
        String color=lit.nextLine();
        chassis.setChassiscolor(color);
        Moteur motor= new Moteur();
        System.out.println("Choose your motor force");
        int hp=lit.nextInt();
        motor.setHp(hp);
        System.out.println("Write the car serial");
        int serial0 = lit.nextInt();
        carro.get(serial).setRuedas(wheels);
        carro.get(serial).setChasis(chassis);
        carro.get(serial).setMotor(motor);
        carro.get(serial).setNombre(serial0);
}}
