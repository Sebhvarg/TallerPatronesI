/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espol.ds.grupo6.patronesddg6;

import com.espol.ds.grupo6.patronesddg6.patronfactorymethod.BasicCard;
import com.espol.ds.grupo6.patronesddg6.patronfactorymethod.CreditCard;
import com.espol.ds.grupo6.patronesddg6.patronfactorymethod.FactoryVIPCard;
import com.espol.ds.grupo6.patronesddg6.patronfactorymethod.PremiumCard;
import com.espol.ds.grupo6.patronesddg6.patronfactorymethod.VipCard;

/**
 *
 * @author sebas
 */
public class PatronesDDG6 {

    public static void main(String[] args) {
        // Tarjetas
        CreditCard clienteBasico = new BasicCard();
        CreditCard ClientePremium = new PremiumCard();
        CreditCard ClienteVIP = new VipCard();
        
    }
}
