import java.util.Map;
import java.util.Scanner;

public class Country {
    private String code;
    private String countryName;
    private String numberOfCitizens;

    public Country(String code, String countryName, String numberOfCitizens) {
        this.code = code;
        this.countryName = countryName;
        this.numberOfCitizens = numberOfCitizens;
    }

    static public void showInfoAbutCountryFromMap(Map<String, Country> map) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kod dowolnego europejskiego kraju, o którym chcesz zobaczyć informacje:");
        String code = scan.nextLine();
        scan.close();
        if (map.get(code) == null) {
            System.out.println("Nie ma takiego kraju w Europie.");
            return;
        }
        System.out.println(map.get(code));
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s ludności.\n", countryName, code, numberOfCitizens);
    }
}
