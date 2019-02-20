/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clopsync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mariani_luca
 */
public class ThCorsaDeiCavalli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi datiC = new DatiCondivisi();
        int nPassi = 50;

        ThCorsa Clop1 = new ThCorsa(datiC, nPassi, "Clop1");
        ThCorsa Clop2 = new ThCorsa(datiC, nPassi, "Clop2");
        ThCorsa Clop3 = new ThCorsa(datiC, nPassi, "Clop3");
        ThCorsa Clop4 = new ThCorsa(datiC, nPassi, "Clop4");
        ThCorsa Clop5 = new ThCorsa(datiC, nPassi, "Clop5");
        ThVisualizza vis = new ThVisualizza(datiC, nPassi);

        vis.start();
        Clop1.start();
        Clop2.start();
        Clop3.start();
        Clop4.start();
        Clop5.start();

        try {
            Clop1.join();
            Clop2.join();
            Clop3.join();
            Clop4.join();
            Clop5.join();
            vis.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThCorsaDeiCavalli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
