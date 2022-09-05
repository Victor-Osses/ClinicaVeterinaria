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
public class ClienteDAO {
    public List<Cliente> retriveAllClients() {
        List<Cliente> clients = new ArrayList();
        clients.add(new Cliente(1, "123456-345", "cliente@gmail.com", 1, "Victor", "R. do Victor", "199356-2453"));
        clients.add(new Cliente(2, "234567-789", "cliente2@gmail.com", 2, "Maria", "R. da Maria", "343541-2452"));
        return clients;
    }
    
     
    // public int updateCliente(int idCliente) {}
}
