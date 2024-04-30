package exercice1;

public class Cell {
    public int data;
    public Cell next;

    public Cell(int data, Cell next) {
        this.data = data;
        this.next = next;
    }

    public Cell(int data) {
        this(data, null);
    }

    public void appendRec(Cell x) {
        if (this.next != null) {
            this.next.appendRec(x);
        } else {
            Cell tmp = x;
            tmp.next = null;
            this.next = tmp;

        }
    }

    public void rotateRec(int k) {
        if(this.next!=null){
            
        }
    }

    public void print() {
        if (this.next != null) {
            System.out.print(this.data + " ");
            this.next.print();
        } else {
            System.out.print(this.data + " ");
        }
        System.out.println();
    }

}
