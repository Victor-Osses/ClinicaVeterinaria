/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.controller;

import com.mycompany.clinicaveterinaria.model.Animal;
import com.mycompany.clinicaveterinaria.model.AnimalDAO;
import com.mycompany.clinicaveterinaria.model.Cliente;
import com.mycompany.clinicaveterinaria.model.ClienteDAO;
import java.util.List;

/**
 *
 * @author Victor Hugo Costa Osses
 */
public class Controller {
    public Controller() {}
    
    public List<Cliente> getAllClients() {
        ClienteDAO cli = new ClienteDAO();
        return cli.retriveAllClients();
    }
    
     public List<Animal> getAllAnimals(String clientId) {
        AnimalDAO ani = new AnimalDAO();
        return ani.retriveClientAnimals(clientId);
    }
}
