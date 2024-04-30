public class Bloc2 extends Bloc1{ private int argument1;
    public Bloc2(int adr, int arg1) { 
        super(adr);
        this.argument1 = arg1;
    }
    public int getArg1() { 
        return this.argument1;
    }
}