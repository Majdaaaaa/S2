
public class Pair {
    public int x,y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair add(Pair pair) {
        pair.y+=1;
        return pair;
    }
}
