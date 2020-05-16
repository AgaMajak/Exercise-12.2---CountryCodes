import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

    public static Map<String, Country> returnMapWithCountries(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<Country> countries = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] countryElements = line.split(";");
            String code = countryElements[0];
            String countryName = countryElements[1];
            String numberOfCitizens = countryElements[2];
            countries.add(new Country(code, countryName, numberOfCitizens));
        }

        Map<String, Country> mapOfCountries = new HashMap<>();

        for (Country country : countries) {
            mapOfCountries.put(country.getCode(), country);
        }

        scanner.close();
        return mapOfCountries;

    }
}
