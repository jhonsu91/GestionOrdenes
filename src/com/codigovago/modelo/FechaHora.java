/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codigovago.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class FechaHora implements Runnable {
    JLabel label;
    public FechaHora(JLabel label1) {
        this.label = label1;
    }
    public void setLabel(JLabel label) {
        this.label = label;
    }  
    public String Tiempo1() {
        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat hora  = new SimpleDateFormat("HH:mm:ss");
        return ( fecha.format(date)+" "+ hora.format(date));
    }
    @Override
    public void run() {
        int i = 1;
        try {
            do {
                this.label.setText("" + Tiempo1() + " ");
            } while (i == 1);
        } catch (Exception e) {

        }
    }
    
}
