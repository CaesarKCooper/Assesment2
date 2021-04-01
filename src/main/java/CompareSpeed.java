import java.util.Comparator;

public class CompareSpeed implements Comparator<IDriveable> {

    @Override
    public int compare(IDriveable one, IDriveable two) {

        if(one.milesPerHour() > two.milesPerHour()){

        return 1;
    }
        return -1;
}
}
