/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class2;

import java.util.ArrayList;

/**
 * Representa una Fruta y algunas caracteristicas que la componen
 * 
 * @author Diego Felipe Aguirre Lopez
 */
public class Fruit {
    
 /**
 * Variables Nativas de la Clase Fruit
 */
    public String name;
    private float averageWeight;
    public ArrayList colors;

/**
 * Crea una instancia de la Clase Fruit
 */
    public Fruit() {
    }  

/**
 * Métodos Getter y Setter
 */
    public ArrayList getColors() {
        return colors;
    }

    public void setColors(ArrayList colors) {
        this.colors = colors;
    }
    
    
}
