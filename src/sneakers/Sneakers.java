/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sneakers;

/**
 *
 * @author Michelle
 */
public class Sneakers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TheSneakers zapatos = new TheSneakers();
        zapatos.setModel(544815);
        zapatos.setSize(6.5);
        zapatos.setColor("Beige");
        zapatos.setMarca("Nike");

        zapatos.toString();
    }

}
