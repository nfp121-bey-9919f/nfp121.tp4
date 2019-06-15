package question2;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

/**
 * Observe les clics d'un bouton.
 * 
 * @author Fabien PERRONNET
 * @version 1.0.0
 */
public class JButtonObserver implements ActionListener {
    private String nom;
    private TextArea contenu;

    /**
     * Cr�e une nouvelle instance de {@see question2.JButtonObserver}.
     * 
     * @param nom Nom du bouton.
     * @param contenu Zone de texte dans laquelle sera ajout� le message au clic du bouton.
     */
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    /**
     * Ev�nement d�clench� lorsqu'un bouton notifie un clic.
     * Affiche un message texte dans la zone de contenu.
     * 
     * @param evt Ev�nement transmis.
     */
    public void actionPerformed(ActionEvent evt) {
        String message = "observateur " + nom + " : clic du bouton " + evt.getActionCommand(); 
        contenu.append(message + "\n");
    }
}