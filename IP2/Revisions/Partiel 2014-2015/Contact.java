public class Contact{
    private String name;
    private String firstName;
    private String phone;
    public static int num;


    Contact(String name,String firstName){
        this.name=name;
        this.firstName=firstName;
        num++;
    }

    Contact(String name,String firsrName,String phone){
        this.name=name;
        this.firstName=firsrName;
        this.setPhone(phone);
        num++;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){ //faire attention faut verifier que ya pas des lettres 
        if(phone.length()==10 && phone.charAt(0)=='0'){
            this.phone=phone; //donc la c faux 
        }
    }
    public String getName(){
        return this.name;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public static int nbCreatedContacts(){ //static ou pas faut voir si la methode s'applique a tout les objets ou a un seul
        return num;
    }

    public String toString(){
        return this.name+" "+this.firstName+" "+this.phone;
    }



}