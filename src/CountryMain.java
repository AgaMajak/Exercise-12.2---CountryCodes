import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class CountryMain {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "CountryCodes.CSV";
        File file = new File(filename);

        Map<String, Country> mapOfCountries = FileReader.returnMapWithCountries(file);

        Country.showInfoAbutCountryFromMap(mapOfCountries);

    }
}
