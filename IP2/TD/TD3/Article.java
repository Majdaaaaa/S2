package TD.TD3;

public class Article {
    private final String description;
    private FileDAttente file;
    private int identifiant;

    public Article(String d){
        this.description=d;
        this.file=new FileDAttente();
        this.identifiant=0;
    }
}
