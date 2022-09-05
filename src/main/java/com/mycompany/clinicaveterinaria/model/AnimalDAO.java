/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class AnimalDAO {
    public List<Animal> retriveClientAnimals(String clientId) {
        List<Animal> ani = new ArrayList();
        switch (clientId) {
            case "1" -> {
                ani.add(new Animal(1, "Tirulipa", 6, 'M', 1, "cachorro"));
                ani.add(new Animal(2, "Pastel", 2, 'M', 2, "passáro"));
            }
            case "2" -> {
                ani.add(new Animal(1, "Marguerita", 7, 'F', 3, "gato"));
                ani.add(new Animal(2, "Cleber", 8, 'M', 4, "cobra"));
            }
            default -> System.out.println("Aí se me quebrou usuário! Como fez isso?");
        }
        
        return ani;
    }
}
