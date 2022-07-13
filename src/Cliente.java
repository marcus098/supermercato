public class Cliente implements Comparable<Cliente> {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Cliente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        if (age > 0)
            this.age = age;
        this.id = Utilities.getAndIncrementCount();
    }

    @Override
    public int compareTo(Cliente other) {
        return other.age - this.age;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", cognome: " + surname + ", eta': " + age;
    }
}
