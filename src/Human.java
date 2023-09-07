public class Human {
    String name;
    int age;
    Human parent;
    Name name1;
    public Human() {}
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(Name name1, int age) {
        this.name1 = name1;
        this.age = age;
    }
    Point point;


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", parent=" + parent +
                ", name1=" + name1 +
                ", point=" + point +
                '}';
    }
}
