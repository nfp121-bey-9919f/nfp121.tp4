package question3;

import question3.tp3.PileI;
import question3.tp3.PileVideException;
import question3.tp3.PilePleineException;

/**
 * Représente le modèle dans une implémentation MVC d'une calculette à pile.
 * 
 * @author Fabien PERRONNET
 * @version 1.0.0
 */
public class PileModele<T> extends  java.util.Observable implements PileI<T> {
    private PileI<T> pile;

    /**
     * Crée une nouvelle instance de {@see question3.PileModele}.
     * 
     * @param pile Instance de pile utilisée pour empiler les opérandes.
     */
    public PileModele(PileI<T> pile) {
        this.pile = pile;
    }

    /**
     * Empile un opérande dans la calculette.
     * 
     * @param o Opérande à empiler.
     */
    public void empiler(T o) throws PilePleineException {
      pile.empiler(o);
      setChanged();
      notifyObservers(o);
    }

    /**
     * Dépile un opérance de la calculette.
     * 
     * @return Opérande dépilé.
     */
    public T depiler() throws PileVideException {
        T item = pile.depiler();
        setChanged();
        notifyObservers(item);
        return item;
    }

    /**
     * Retourne le dernier opérande empilé dans la calculette.
     */
    public T sommet() throws PileVideException {
        return pile.sommet();
    }

    /**
     * Retourne la taille de la pile interne de la calculette.
     * 
     * @return La taille de la pile.
     */
    public int taille() {
        return pile.taille();
    }

    /**
     * Retourne la capacité de la pile interne de la calculette.
     * 
     * @return La capacité de la pile.
     */
    public int capacite() {
        return pile.capacite();
    }
    
    /**
     * Définit si la pile interne est vide.
     * 
     * @return Un booléen indiquant si la pile est vide.
     */
    public boolean estVide() {
        return pile.estVide();
    }

    /**
     * Définit si la pile interne est pleine.
     * 
     * @return Un booléen indiquant si la pile est pleine.
     */
    public boolean estPleine() {
        return pile.estPleine();
    }

    /**
     * Converti le modèle en chaine de caractères.
     */
    public String toString() {
        return pile.toString();
    }
}