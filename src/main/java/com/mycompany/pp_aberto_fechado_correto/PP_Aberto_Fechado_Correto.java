/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_aberto_fechado_correto;

/**
 *
 * @author nando
 */
public class PP_Aberto_Fechado_Correto {

    public static void main(String[] args) {
        Car sedan = new Sedan("Monza","Chevrolet",1988,"Vermelho");
        
        sedan.imprimeDados();
        
        CarService pintura = new SedanService();
        
        pintura.paintCar(sedan,"vinho");
        
        sedan.imprimeDados();
    }
}
