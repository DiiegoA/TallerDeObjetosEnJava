/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class3;

/**
 * Representa una Cuenta Bancaria y algunas caracteristicas que la componen
 * 
 * @author Diego Felipe Aguirre Lopez
 */
public class BankAccount {
    
 /**
 * Variables Nativas de la Clase BankAccount
 */
    private int accountNumber;
    protected boolean activated;

/**
 * Crea una instancia de la Clase BankAccount
 */
    public BankAccount() {
    }

/**
 * Métodos Getter y Setter
 */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
    
}
