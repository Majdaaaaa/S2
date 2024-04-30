package exercice1;

public class List { 
    private Cell head ;

    public List(Cell head){
        this.head=head;
    }
    void rotateIt(int k){ 
        //les cas sp
        if(head!=null){
            Cell tmp=head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            for(int i=1;i<=k;i++){
                tmp.next=head;
                head=head.next;
                tmp=tmp.next;
            }
            Cell tmp2=head;
            while(tmp2.next!=head){
                tmp2=tmp2.next;
            }
            tmp2.next=null;
        }
    }
    
    public void rotateRec(int k){
        if(this.head!=null){
            if(k!=0){
                head.appendRec(head);
                head=head.next;
                k--;
                head.next.appendRec(head);
            }
        }
    }




    public void print(){
        if(this.head!=null){
            head.print();
        }
    }
}