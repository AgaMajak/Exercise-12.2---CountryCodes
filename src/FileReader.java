import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

    public static Map<String, Country> returnMapWithCountries(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        Map<String, Country> mapOfCountries = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] countryElements = line.split(";");
            String code = countryElements[0];
            String countryName = countryElements[1];
            String numberOfCitizens = countryElements[2];
            mapOfCountries.put(code, new Country(code, countryName, numberOfCitizens));
        }
        scanner.close();
        return mapOfCountries;

    }
}
