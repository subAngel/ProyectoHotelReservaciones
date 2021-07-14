/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Date;

/**
 *
 * @author angel
 */
public class Huesped {
    
    private int id_huesped;
    private int numero_hab;
    private String Nombre;
    private String telefono;
    private Date fecha_ingreso;
    private Date fecha_salida;
    private int num_personas;
    private double pago;
    
    public Huesped(){}

    public Huesped(int id_huesped, int numero_hab, String Nombre, String telefono, Date fecha_ingreso, Date fecha_salida, int num_personas, double pago) {
        this.id_huesped = id_huesped;
        this.numero_hab = numero_hab;
        this.Nombre = Nombre;
        this.telefono = telefono;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.num_personas = num_personas;
        this.pago = pago;
    }

    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public int getNumero_hab() {
        return numero_hab;
    }

    public void setNumero_hab(int numero_hab) {
        this.numero_hab = numero_hab;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
        
    
}
