package exercie2;

public class Node {
    private char etiq ;
    private Node fg, fd;
    Node(char e, Node x, Node y) { 
        etiq=e; fg=x; fd=y;
    }
    public void setG(Node x) {
        fg =x;
    } 
    public void setD(Node x) {
        fd =x;
    } 
    public Node getG() {
        return fg ;
    }

    public void afficheInfixe() {
        if(this.fg!=null){
            this.fg.afficheInfixe();
        }
        System.out.print(this.etiq+",");
        if(this.fd!=null){
            this.fd.afficheInfixe();
        }
        System.out.println();
    }
}

