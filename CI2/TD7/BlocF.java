public class BlocF extends Bloc{ 
    private int argument1;
    private int variable1;
    public BlocF (int adr,int arg1){
        super(adr);
        this.argument1=arg1;
    }
    public int getArg1(){
        return this.argument1;
    }
    public int getVar1(){
        return this.variable1;
    }
    public void setVar1(int variable1){
        this.variable1=variable1;
    }
}
