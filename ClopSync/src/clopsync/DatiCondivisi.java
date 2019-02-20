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
public class DatiCondivisi {

    private int passi;
    private String nome;

    public DatiCondivisi() {
        passi = 0;
        nome = "";
    }

    synchronized public void incPassi() {
        passi = passi + 1;
    }

    synchronized public int getPassi() {
        return passi;
    }

    synchronized public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
