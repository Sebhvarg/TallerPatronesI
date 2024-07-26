/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.patronesddg6.patronfacade;

/**
 *
 * @author sebas
 */
public class Member {
    public void doTransacction(){
    //codigo
    Facade f = new Facade();
    // Puede ser
    f.movil.MovilTransaction();
    f.phone.PhoneTransaction();
    f.web.WebTransaction();
    
    }
}
