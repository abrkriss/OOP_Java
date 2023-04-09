public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Cristina", "Abramova", Gender.Female," 31/07/1999 " );
        Human person2 = new Human("Vladislav", "Levin", Gender.Male, "13/10/1995");

        Human  person4 = new Human("Helena", "Ink", Gender.Female, "20/10/2000");
        Human  person5 = new Human("Ivan", "Petrov", Gender.Male, "08/08/1994");

        Members person3 = new Members("Milania", "Levina", Gender.Female, "05/07/2022", person2, person1);
        System.out.println(person3);
        Members person6 = new Members("Sergey", "Petrov", Gender.Male, "05/12/2020", person5, person4);
        System.out.println(person6);
        Members person7 = new Members("Olga", "Petrova", Gender.Female, "10/10/2035", person6, person3);
        System.out.println(person7);

    }
}
