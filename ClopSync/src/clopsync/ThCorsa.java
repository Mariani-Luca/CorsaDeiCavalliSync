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
public class ThCorsa extends Thread {

    private DatiCondivisi ptrDati;
    private int nPassi;
    private String nome;

    public ThCorsa(DatiCondivisi ptrDati, int nPassi, String nome) {
        this.ptrDati = ptrDati;
        this.nPassi = nPassi;
        this.nome = nome;
    }

    @Override
    public void run() {
        ptrDati.setNome(nome);
        for (int i = 0; i < nPassi; i++) {
            ptrDati.incPassi();
        }
    }
}
