/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class6;

/**
 * Representa una Pelota y algunas caracteristicas que la componen
 * 
 * @author Diego Felipe Aguirre Lopez
 */
public class Ball {
    
    
 /**
 * Variables Nativas de la Clase Ball
 */
    public String typeBall;
    private double iForce; //impactForce
    protected double fSpeed; //falling speed

 /**
 * Crea una instancia de la Clase Ball
 */
    public Ball() {
    }

/**
 * Métodos Getter y Setter
 */
    public String getTypeBall() {
        return typeBall;
    }

    public void setTypeBall(String typeBall) {
        this.typeBall = typeBall;
    }
    
/**
 * Método que calcula la fuerza de impacto de la pelota
 * @param iForce valor numérico para calcular la fuerza de impacto
 */
    private double impactForce(){
        return iForce;
    }
    
/**
 * Método que calcula la velocidad de caida de la pelota
 * @param fSpeed valor numérico para calcular la velocidad de caida
 */
    protected double fallingSpeed(){
        return fSpeed;
    }
    
    
}
