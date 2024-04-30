public class BlocE implements E {
    private int adresseDeRetour;
    public int getAdr() {
        return adresseDeRetour;
    }
    private int valeurDeRetour;
    public int getVal() {
        return valeurDeRetour;
    }

    public void setVal(int valeurDeRetour) {
        this.valeurDeRetour = valeurDeRetour;
    }
    private int argument1;
    public int getArg1() {
        return argument1;
    }

    public void setArg1(int argument1) {
        this.argument1 = argument1;
    }
    private int argument2;
    public int getArg2() {
        return argument2;
    }

    public void setArg2(int argument2) {
        this.argument2 = argument2;
    }
    private int variable1;

    public int getVar() {
        return variable1;
    }

    public void setVar(int variable1) {
        this.variable1 = variable1;
    }

    public BlocE(int adresseDeRetour, int argument1, int argument2) {
        this.adresseDeRetour = adresseDeRetour;
        this.argument1 = argument1;
        this.argument2 = argument2;
    }
}