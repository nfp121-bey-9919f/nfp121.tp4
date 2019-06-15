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
     * Crée une nouvelle instance de {@see question2.JButtonObserver}.
     * 
     * @param nom Nom du bouton.
     * @param contenu Zone de texte dans laquelle sera ajouté le message au clic du bouton.
     */
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    /**
     * Evénement déclenché lorsqu'un bouton notifie un clic.
     * Affiche un message texte dans la zone de contenu.
     * 
     * @param evt Evénement transmis.
     */
    public void actionPerformed(ActionEvent evt) {
        String message = "observateur " + nom + " : clic du bouton " + evt.getActionCommand(); 
        contenu.append(message + "\n");
    }
}