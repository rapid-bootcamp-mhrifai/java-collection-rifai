package iterableCollection;

import java.util.StringJoiner;

public class Person {
    private int id;
    private String name;
    private String city;

    public Person(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + " [", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("city='" + city + "'")
                .toString();
    }
}
