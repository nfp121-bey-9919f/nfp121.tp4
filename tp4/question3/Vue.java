package question3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.util.Observable;
import java.util.Observer;

/**
 * Représente la vue dans une implémentation MVC d'une calculette à pile.
 * 
 * @author Fabien PERRONNET
 * @version 1.0.0
 */
public class Vue extends JPanel implements Observer {
    private JLabel etatPile;
    private PileModele<Integer> pile;

    /**
     * Crée une nouvelle instance de {@see question3.Vue}
     * 
     * @param pile Modèle auquel la vue est rattachée.
     */
    public Vue(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.etatPile = new JLabel("entrez des nombres entiers");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(etatPile);
        setBackground(Color.green);
        // inscription auprès du modèle comme observateur
        pile.addObserver(this);
    }

    /**
     * Met à jour la vue suite à une émission du modèle.
     */
    public void update(Observable obs, Object arg) {
        etatPile.setText(pile.toString());
    }
}