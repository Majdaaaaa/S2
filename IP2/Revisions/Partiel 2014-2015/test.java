public class test {
    public static void main(String[] args){
        Contact k=new Contact("Kaeya","Albreich","0145678934");
        Contact d=new Contact("Diluc", "Ragnvid","0134567899");
        Contact l=new Contact("Lisa", "Minci","0278493483");
        Contact r=new Contact("Razor", "Minci","0137577890");
        Contact n=new Contact("Nilou", "S","0134a67890");
        Contact n1=new Contact("Nilou", "U","0278493483");

        //System.out.println(Contact.nbCreatedContacts());
        AdressBook a=new AdressBook();
        a.addNewContact(k);
        a.addNewContact(d);
        a.addNewContact(l);
        a.addNewContact(r);
        a.addNewContact(n);
        a.addNewContact(n1);
        System.out.println(a.nbContacts());
        a.ls();
        System.out.println(a.nbFrancilienContacts());
        //a.lsByName("Nilou");
        System.out.println(a.rmByName("Kaeya"));
        a.ls();

    }
}
