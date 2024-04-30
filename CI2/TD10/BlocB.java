public class BlocB extends Bloc {
    private int argument;
    private boolean variable;
    
    public BlocB(int adr, int arg){
        super(adr);
        this.argument=arg;
    }

    public int getArg(){
        return this.argument;
    }

    public void setArg(int val){
        this.argument=val;
    }

    public boolean getVar(){
        return this.variable;
    }

    public void setVar(boolean var){
        this.variable=var;
    }
}
