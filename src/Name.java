import java.util.Objects;

public class Name {
    String name, secondName, fatherName;

    Name (){

    }
    Name (String name){
        this(name,name);

    }
    Name (String name, String secondName){
        this(name,name,name);

    }
    Name (String name, String secondName, String fatherName){
        this.name = name;
        if(Objects.equals(secondName, this.name)) this.secondName = null;
        if(Objects.equals(fatherName, this.name)) this.fatherName = null;

    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
