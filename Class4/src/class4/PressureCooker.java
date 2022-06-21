/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class4;

/**
 * Representa una Olla a Presión y algunas caracteristicas que la componen
 * 
 * @author Diego Felipe Aguirre Lopez
 */
public class PressureCooker {
    
 /**
 * Variables Nativas de la Clase PressureCooker
 */
    public double literCapacity;
    private long cTime;
    protected long hTime;
    
 /**
 * Crea una instancia de la Clase PressureCooker
 */
    public PressureCooker() {
    }

/**
 * Métodos Getter y Setter
 */
    public double getLiterCapacity() {
        return literCapacity;
    }

    public void setLiterCapacity(double literCapacity) {
        this.literCapacity = literCapacity;
    }
    
/**
 * Método que calcula el tiempo de enfriamiento de la olla a presión
 * @param cTime valor numérico para calcular el tiempo de enfriamiento
 */
    private long coolingTime(){
        return cTime;
    }
    
/**
 * Método que calcula el tiempo de calentamiento de la olla a presión
 * @param hTime valor numérico para calcular el tiempo de calentamiento
 */
    protected long heatingTime(){
        return hTime;
    }
}
