import java.util.Map;
import java.util.Scanner;

public class CountryInformation {

    static public void showInfoAbutCountryByCode(Map<String, Country> countryByCodeMap) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kod dowolnego europejskiego kraju, o którym chcesz zobaczyć informacje:");
        String code = scan.nextLine();
        scan.close();
        if (countryByCodeMap.get(code) == null) {
            System.out.println("Nie ma takiego kraju w Europie.");
            return;
        }
        System.out.println(countryByCodeMap.get(code));
    }

}
