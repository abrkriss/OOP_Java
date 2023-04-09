import java.util.List;

public class Human {
    private String firstname;
    private String lastname;
    private Gender gender;
    private String birthdate;

    List<Human> children;

    public Human(String firstname, String lastname, Gender gender, String birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthdate = birthdate;

    }




    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public String getBirthdate() {
        return birthdate;
    }



    @Override
    public String toString() {
        return firstname + " " + lastname + " " +gender + " " + birthdate + "г";



    }
}
