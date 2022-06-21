/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class1;

import java.util.Date;

/**
 * Representa una Persona y algunas caracteristicas que la componen
 * 
 * @author Diego Felipe Aguirre Lopez
 */
public class Person {
    
 /**
 * Variables Nativas de la Clase Person
 */    
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
 /**
 * Crea una instancia de la Clase Person
 */
    public Person() {
    }

/**
 * Métodos Getter y Setter
 */     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
       
    
}
