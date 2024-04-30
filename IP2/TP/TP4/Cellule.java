package TP.TP4;

public class Cellule {
    private Robot rob;
    private Cellule suivant;

    public Cellule(Robot rob,Cellule suivant){
        this.rob=rob;
        this.suivant=suivant;
    }

    public Cellule(Robot rob){
        this(rob,null); //faut pas mettre this.Cellule()  
    }

}
