package question3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.util.Observable;
import java.util.Observer;

/**
 * Repr�sente la vue dans une impl�mentation MVC d'une calculette � pile.
 * 
 * @author Fabien PERRONNET
 * @version 1.0.0
 */
public class Vue extends JPanel implements Observer {
    private JLabel etatPile;
    private PileModele<Integer> pile;

    /**
     * Cr�e une nouvelle instance de {@see question3.Vue}
     * 
     * @param pile Mod�le auquel la vue est rattach�e.
     */
    public Vue(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.etatPile = new JLabel("entrez des nombres entiers");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(etatPile);
        setBackground(Color.green);
        // inscription aupr�s du mod�le comme observateur
        pile.addObserver(this);
    }

    /**
     * Met � jour la vue suite � une �mission du mod�le.
     */
    public void update(Observable obs, Object arg) {
        etatPile.setText(pile.toString());
    }
}