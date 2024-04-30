public class ContactCell {
    private Contact contact;
    private ContactCell suivant;
    
    ContactCell(Contact contact,ContactCell suivant){
        this.contact=contact;
        this.suivant=suivant;
    }
    ContactCell(Contact contact){
        this(contact,null);
    }

    public Contact getCon(){
        return this.contact;
    }

    public ContactCell getSuiv(){
        return this.suivant;
    }
    public int nbContacts(){
        ContactCell tmp=this;
        int res=0;
        while(tmp!=null){
            res++;
            tmp=tmp.suivant;
        }
        return res;
    }
    public int nbContactsRec(){
        if(this.suivant!=null){
            return 1+this.suivant.nbContactsRec();
        }else{
            return 1;
        }
    }

    public int nbFrancilienContacts(){
        ContactCell tmp=this;
        int res=0;
        while(tmp!=null){
            if(tmp.getCon().getPhone().charAt(1)=='1'){
                res++;
            }
            tmp=tmp.suivant;
        }
        return res;
    }
    public int nbFrancilienContactsRec(){
        if(this.suivant!=null){
            if(this.getCon().getPhone().charAt(1)=='1'){ //verifier que le tel existe 
                return 1+this.suivant.nbContactsRec();
            }
        }else{
            return 1;
        }
        return 0;
    }

    public void ls(){
        ContactCell tmp=this;
        while(tmp!=null){
            System.out.println(tmp.contact.toString());
            tmp=tmp.suivant;
        }
    }
    public void lsRec(){
        if(this.suivant!=null){
            System.out.println(this.contact.toString());
            this.suivant.lsRec();
        }else{
            System.out.println(this.contact.toString());
        }

    }

    public void lsByName(String Name){
        ContactCell tmp=this;
        while(tmp!=null){
            if(tmp.contact.getName().equals(Name)){
                System.out.println(tmp.contact.toString());
            }else{    
            }
            tmp=tmp.suivant;
        }
    }
    public void lsByNameRec(String Name){ //affiche pas le dernier 
        if(this.suivant!=null){
            if(this.contact.getName().equals(Name)){
                System.out.println(this.contact.toString());
                this.suivant.lsByNameRec(Name);
            }else{
                this.suivant.lsByNameRec(Name);
            }
        }
        if(this.suivant==null){
            if(this.contact.getName().equals(Name)){
                System.out.println(this.contact.toString());
            }
        }
    }

    public void addNewContact(Contact c){
        ContactCell tmp=this;
        while(tmp!=null){
            if(tmp.suivant==null){
                ContactCell nv=new ContactCell(c);
                tmp.suivant=nv;
                break;
            }
            tmp=tmp.suivant;
        }
    }
    public void addNewContactRec(Contact c){ //simplifier en ajouter au debut 
        if(this.suivant!=null){
            this.suivant.addNewContactRec(c);
        }else{
            ContactCell nv=new ContactCell(c);
            this.suivant=nv;
        }
    }

    public boolean rmContact(String phone){
        ContactCell tmp=this;
        boolean res=true;
        while(tmp.suivant !=null){
            if(tmp.suivant.contact.getPhone().equals(phone)){
                tmp.suivant=tmp.suivant.suivant;
                res=true;
            }else{
                res=false;
            }
            tmp=tmp.suivant;
        }
        return res;
    }
    public boolean rmContactRec(String phone){
        boolean res=false;
        if(this.suivant.suivant!=null){
            if(this.suivant.contact.getPhone().equals(phone)){
                this.suivant=this.suivant.suivant;
                res=true;
            }else{
                this.suivant.rmContactRec(phone);
            }
        }
        return res;
    }

    public boolean rmByName(String nom){
        ContactCell tmp =this;
        boolean res=true; //initialiser false 
        while(tmp.suivant!=null){
            if(tmp.suivant.contact.getName().equals(nom)){
                tmp.suivant=tmp.suivant.suivant;                  
                res=true;
            }else{
                res=false;
            }
            tmp=tmp.suivant;
        }
        return res;
    }

        
}






