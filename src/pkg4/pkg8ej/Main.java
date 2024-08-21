/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg8ej;
public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Team A", "España");

        Velocista velocista = new Velocista(1, "Juan", 500, 60);
        Escalador escalador = new Escalador(2, "Carlos", 2.5f, 10);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Pedro", 45);

        equipo.agregarCiclista(velocista);
        equipo.agregarCiclista(escalador);
        equipo.agregarCiclista(contrarrelojista);

        equipo.imprimirEquipo();

        System.out.println("\nBuscando ciclista con ID 2:");
        equipo.buscarCiclistaPorId(2);
    }
}

