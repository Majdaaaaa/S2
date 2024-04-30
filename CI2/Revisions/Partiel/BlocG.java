public class BlocG extends BlocF {
    private int argument2;
    private int variable;
    public BlocG(int adr,int arg1,int arg2){
        super(adr,arg1);
        this.argument2=arg2;
    }
    public int getArg2(){
        return this.argument2;
    }
    public int getVar(){
        return this.variable;
    }
    public void setArg2(int arg2){
        this.argument2=arg2;
    }
    public void setVar(int var){
        this.variable=var;
    }
}

