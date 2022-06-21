/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class5;

/**
 * Representa una Gato y algunas caracteristicas que lo componen
 * 
 * @author Diego Felipe Aguirre Lopez
 */
public class Cat {
    
 /**
 * Variables Nativas de la Clase Cat
 */
    public float weight;
    private int jHeight;
    protected int dTraveled;  

 /**
 * Crea una instancia de la Clase Cat
 */
    public Cat() {
    }

/**
 * Métodos Getter y Setter
 */
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
/**
 * Método que calcula la altura de salto del gato
 * @param jHeight valor numérico para calcular la altura de salto
 */
    private int jumpHeight(){
        return jHeight;
    }
   
/**
 * Método que calcula la distancia recorrida del gato
 * @param dTraveled valor numérico para calcular la distancia recorrida
 */
    protected int distanceTraveled(){
        return dTraveled;
    }
}
