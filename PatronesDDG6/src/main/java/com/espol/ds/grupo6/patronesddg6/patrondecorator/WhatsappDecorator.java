/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.patronesddg6.patrondecorator;

/**
 *
 * @author sebas
 */
public class WhatsappDecorator extends BaseDecorator {
    @Override
    public void send(String mensaje) {
        System.out.print(mensaje + "Enviado Por Whatsapp");
    }
}
