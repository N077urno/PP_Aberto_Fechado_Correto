/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_aberto_fechado_correto;

/**
 *
 * @author nando
 */
public class SedanService implements CarService {
    @Override
    public void paintCar(Car car, String color) {
        Sedan sedan = (Sedan) car;
        sedan.setColor(sedan, color);
        
    }
}
