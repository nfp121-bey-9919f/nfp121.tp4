package question2;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.TextArea;
import java.awt.Point;

/**
 * Observe les mouvements de souris sur un bouton.
 * 
 * @author Fabien PERRONNET
 * @version 1.0.0
 */
public class JMouseObserver implements MouseListener {
    private String nom;
    private TextArea contenu;

    /**
     * Crée une nouvelle instance de {@see question2.JMouseObserver}.
     * 
     * @param
     */
    public JMouseObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    /**
     * Evénement déclenché quand le pointer de la souris entre dans la zone du bouton observé.
     * 
     * @param Evénement tranmis.
     */
    public void mouseEntered(MouseEvent e) {
        Point p = e.getPoint();
        String message = "observateur " + nom + " : souris entrée en (" + p.x + "," + p.y + ")";
        contenu.append(message + "\n");
    }

    public void mouseClicked(MouseEvent e) { }
    
    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}
}