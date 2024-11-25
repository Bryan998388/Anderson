/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Dividir;
import Modelo.Modelo;
import Modelo.Multiplicar;
import Modelo.Resta;
import Modelo.Suma;
import Vista.Vista;
import javax.swing.JOptionPane;

/**
 *
 * @anderson tuni
 */
public class Controlador {
    private Modelo modelo;
    private Suma suma;
    private Resta resta;
    private Dividir dividir;
    private Multiplicar multiplicar;
    private Vista vista;
    
    public Controlador(Vista vista){
        this.modelo = new Modelo();
        this.suma = new Suma();
        this.resta = new Resta();
        this.dividir = new Dividir();
        this.multiplicar = new Multiplicar();
        this.vista = vista;
    }
    public void BOTON_SUMA(){
        try{
            float numero1 = Float.parseFloat(vista.getNumero_1());
            float numero2 = Float.parseFloat(vista.getNumero_2());
            suma.setNumero1(numero1);
            suma.setNumero2(numero2);
            float suma1 = suma.sumt();
            vista.RESULTADO_SUMA(suma1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, " Datos erroneos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);;
        }
      
    }
    public void BOTON_RESTA(){
        try{
            float numero1 = Float.parseFloat(vista.getNumero_1());
            float numero2 = Float.parseFloat(vista.getNumero_2());
            resta.setNumero1(numero1);
            resta.setNumero2(numero2);
            float rest = resta.rest();
            vista.RESULTADO_RESTA(rest);
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, " Datos erroneos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);;
        }
       
    }
    public void BOTON_DIVIDIR(){
        try{
            float numero1 = Float.parseFloat(vista.getNumero_1());
            float numero2 = Float.parseFloat(vista.getNumero_2());
            dividir.setNumero1(numero1);
            dividir.setNumero2(numero2);
            float dividir1 = dividir.Divt();
            vista.RESULTADO_DIVIDIR(dividir1);
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, " Datos erroneos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);;
        }
    }
    public void BOTON_MULTIPLICAR(){
        try{
            float numero1 = Float.parseFloat(vista.getNumero_1());
            float numero2 = Float.parseFloat(vista.getNumero_2());
            multiplicar.setNumero1(numero1);
            multiplicar.setNumero2(numero2);
            float multiplicacion1 = multiplicar.multit();
            vista.RESULTADO_MULTIPLICACION(multiplicacion1);
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, " Datos erroneos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);;
        }
    }
}
