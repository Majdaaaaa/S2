public class BlocF extends BlocR{
    private int argument1;

    public BlocF(int adr,int arg1){
        super(adr);
        this.argument1=arg1;
    }
    public int getArg1(){
        return this.argument1;
    }
    public void setArg1(int arg){
        this.argument1=arg;
    }
}
