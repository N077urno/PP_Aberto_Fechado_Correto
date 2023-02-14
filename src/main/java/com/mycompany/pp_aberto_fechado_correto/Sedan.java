/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_aberto_fechado_correto;

/**
 *
 * @author nando
 */
public class Sedan implements Car {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    
    public Sedan(String model, String make, int year, String color) {
        this.modelo = model;
        this.marca = make;
        this.ano = year;
        this.cor = color;
    }
    
    @Override
    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String getMarca() {
        return marca;
    }
    
    @Override
    public int getAno() {
        return ano;
    }
    
    @Override
    public void setColor(Sedan carro, String color){
        carro.cor = color;
    }
    
    @Override
    public void imprimeDados(){
        System.out.println(":..Dados do Carro..:");
        System.out.println("Modelo..: "+this.modelo);
        System.out.println("Marca..: "+this.marca);
        System.out.println("Ano..: "+this.ano);
        System.out.println("Cor..: "+this.cor);
    }
}
