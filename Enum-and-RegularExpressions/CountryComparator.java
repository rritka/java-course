import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {

    public int compare(final Country o1, final  Country o2){
        int returnValue = 0;
        if (o1.getArea() > o2.getArea()) {
            returnValue = 1;
        } else if (o1.getArea() < o2.getArea()) {
            returnValue = -1;
        }
        return returnValue;
    }
}