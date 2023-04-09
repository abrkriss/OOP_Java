public class Members extends Human{
    private Human father;
    private Human mother;



    public Members(String firstname, String lastname, Gender gender, String birthdate, Human father, Human mother) {
        super(firstname, lastname, gender, birthdate);
        this.father = father;
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }


    public String toString() {
        return super.toString() + " \n" + "Father: " + father + " \n" + "Mother: " + mother;
    }
}
