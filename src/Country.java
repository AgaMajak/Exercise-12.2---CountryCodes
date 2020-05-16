public class Country {
    private String code;
    private String countryName;
    private String numberOfCitizens;

    public Country(String code, String countryName, String numberOfCitizens) {
        this.code = code;
        this.countryName = countryName;
        this.numberOfCitizens = numberOfCitizens;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s ludności.\n", countryName, code, numberOfCitizens);
    }
}
