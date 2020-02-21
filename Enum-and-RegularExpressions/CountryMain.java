public class CountryMain {
    public static void main(String[] args) {

        Country countryZimbabwe = Country.valueOf("ZIMBABWE");

        System.out.println("Country : " + countryZimbabwe.name() + "\nArea(sq km) : " + countryZimbabwe.getArea() +
                "\nPopulation : " + countryZimbabwe.getPopulation());
    }

}
