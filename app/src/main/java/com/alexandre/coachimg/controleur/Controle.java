package com.alexandre.coachimg.controleur;

import com.alexandre.coachimg.modele.Profil;

public final class Controle {

    private static Controle instance = null;
    private Profil profil;

    /**
     * Constructeur private
     */

    private Controle() {
        super();
    }

    /**
     * Creation de l'instance
     * @return instance
     */

    public static final Controle getInstance() {
        if(Controle.instance == null){
            Controle.instance = new Controle();
        }
        return Controle.instance;
    }

    /**
     * Création du profil
     * @param poids
     * @param taille en cm
     * @param age
     * @param sexe 1 pour homme et 0 pour femme
     */

    public void creerProfil(Integer poids, Integer taille, Integer age, Integer sexe){
        profil = new Profil(poids, taille, age, sexe);
    }

    /**
     * recuperation img de profil
     * @return img
     */

    public float getImg(){
        return profil.getImg();
    }

    /**
     * recuperation message de profil
     * @return message
     */

    public String getMessage(){
        return profil.getMessage();
    }
}
