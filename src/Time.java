public class Time {
    int seconds;
    int hours = (seconds*3600);
    int minutes = (seconds % 3600) / 60;
    int seconds1 = seconds % 60;

    @Override
    public String toString() {
        return "Time{" +
                "seconds=" + seconds +
                ", hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}



