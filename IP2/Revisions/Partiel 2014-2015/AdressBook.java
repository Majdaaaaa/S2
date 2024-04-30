public class AdressBook {
    private ContactCell premier;

    //adressebook sans constructeur 

    public int nbContacts(){
        if(this.premier==null){
            return 0;
        }else{
            return this.premier.nbContacts();
        }
    }

    public int nbFrancilienContacts(){
        if(this.premier!=null ){
            return this.premier.nbFrancilienContacts();
        }else{
            return 0;
        }
    }

    public void ls(){
        if(this.premier!=null){
            this.premier.lsRec();
        }
    }

    public void lsByName(String Name){
        if(this.premier!=null){
            this.premier.lsByName(Name);
        }
    }

    public void addNewContact(Contact c){
        if(this.premier==null){
            this.premier=new ContactCell(c);
        }else{
            this.premier.addNewContact(c);
        }
    }

    public boolean rmContact(String phone){
        if(this.premier!=null){
            return this.premier.rmContactRec(phone);
        }else if(this.premier.getCon().getPhone().equals(phone) && this.premier.getSuiv()==null){
            this.premier=null;
            return true;
        }else{
            return false;
        }
    }

    public boolean rmByName(String nom){
        if(this.premier.getCon().getName().equals(nom) && this.premier.getSuiv()==null){
            this.premier=null;
            return true;
        }else if(this.premier!=null){
            return this.premier.rmByName(nom);
        }else if(this.premier.getCon().getName().equals(nom)){
            this.premier=this.premier.getSuiv();
            return true;
        }else{
            return false;
        }
    }

}
