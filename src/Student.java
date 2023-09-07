import java.util.Arrays;

public class Student {
    String name;
   private int [] marks;

    public Student (String name, int ... marks){

        this.name = name;
        for(int x:marks) {
            if(x<2|| x>5) throw new IllegalArgumentException ( x + " is not legal mark");
        }
        this.marks = Arrays.copyOf(marks, marks.length);
 
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
