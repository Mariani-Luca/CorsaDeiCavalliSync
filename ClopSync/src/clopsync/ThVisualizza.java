/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clopsync;

/**
 *
 * @author mariani_luca
 */
public class ThVisualizza extends Thread {

    private DatiCondivisi ptrDati;
    private int nPassi;

    public ThVisualizza(DatiCondivisi ptrDati, int nPassi) {
        this.nPassi = nPassi;
        this.ptrDati = ptrDati;
    }

    @Override
    public void run() {
        for (int i = 0; i < nPassi; i++) {
            System.out.println(ptrDati.getNome() + " Passo numero: " + ptrDati.getPassi());
        }
    }
}
