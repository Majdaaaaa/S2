public class BlocG extends BlocR {
    private int argument1;
    private int argument2;
    public BlocG(int adr,int arg1,int arg2){
        super(adr);
        this.argument1=arg1;
        this.argument2=arg2;
    }
    public int getArg1(){
        return this.argument1;
    }
    public int getArg2(){
        return this.argument2;
    }
}
