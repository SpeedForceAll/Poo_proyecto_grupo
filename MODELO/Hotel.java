/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author JUAN ALDAIR
 */
public abstract class Hotel implements Reserva,Pago{
    private int id;
    private double precio;
    private boolean disponibilidad;
    
public Hotel(int id, double precio, boolean disponibilidad) {
    this.id = id;
    this.precio = precio;
    this.disponibilidad = disponibilidad;
    }

    public boolean estaDisponible(){
        return disponibilidad;
    }
    public abstract double calcularPrecio();
    public abstract void Reservar();

    @Override
    public abstract boolean disponibilidadH();

    @Override
    public  abstract boolean realizarReserva();

    @Override
    public  abstract boolean cancelarReserva();

    @Override
    public  abstract void pago();

    @Override
    public  abstract boolean verificarPago();   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
