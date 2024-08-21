/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg8ej;

import java.util.ArrayList;

class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public static void sumarTiempo(int tiempo) {
        tiempoTotalEquipo += tiempo;
    }

    public void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        sumarTiempo(ciclista.getTiempoAcumulado());
    }

    public void imprimirEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo Total del Equipo: " + tiempoTotalEquipo + " minutos");
        System.out.println("Ciclistas del equipo:");
        for (Ciclista ciclista : ciclistas) {
            ciclista.imprimirDatos();
            System.out.println(ciclista.imprimirTipo());
            System.out.println();
        }
    }

    public void listarNombresCiclistas() {
        System.out.println("Nombres de los ciclistas del equipo:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.getNombre());
        }
    }

    public void buscarCiclistaPorId(int id) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == id) {
                ciclista.imprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista no encontrado con el ID: " + id);
    }
}

