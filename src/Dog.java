import java.util.Arrays;

public class Dog {

   private int weight, height;
    private int marks [];



    public int[] getMarks() {
        return Arrays.copyOf( marks, marks.length);
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Dog(int weight, int height, int...marks){
        this.height = height;
        this.weight = weight;
        this.marks = Arrays.copyOf(marks, marks.length);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String wow(int height){
        if(height>100) return "WOW";
        else return "wow";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}

