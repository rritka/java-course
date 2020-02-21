public class CountryMain {
    public static void main(String[] args) {

        Country countryZimbabwe = Country.valueOf("ZIMBABWE");
        Country countryAfghanistan = Country.valueOf("AFGHANISTAN");
        CountryComparator comparator = new CountryComparator();

        System.out.println("Country : " + countryZimbabwe.name() + "\nArea(sq km) : " + countryZimbabwe.getArea() +
                "\nPopulation : " + countryZimbabwe.getPopulation());

        System.out.println("Comparing valueOf and element by == :" + (countryZimbabwe == Country.valueOf("ZIMBABWE")));

        //Country nonExist = Country.valueOf("COUNTRYOUTOFLIST"); --> java.lang.IllegalArgumentException: No enum constant Country.COUNTRYOUTOFLIST

        System.out.println(countryZimbabwe.compareTo(countryAfghanistan));

        System.out.println(comparator.compare(countryZimbabwe, countryAfghanistan));



    }

}
