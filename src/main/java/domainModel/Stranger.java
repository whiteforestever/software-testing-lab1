package domainModel;

public class Stranger extends Person{

    public Stranger(String name, int age, Gender gender) {
        super(name, age, gender);

    }

    public void bringGirl(Girl girl) {
        System.out.println(this.getName() + " заволок " + girl.getName() + " в бар.");
    }
}