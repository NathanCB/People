public class Main {

    public static void main(String[] args) throws Exception{
        People peopleMatchingCountries = new People();

        peopleMatchingCountries.readAndSortFile();
        peopleMatchingCountries.loadMap();
        peopleMatchingCountries.printMapToConsole();
        peopleMatchingCountries.writeMapToJson();
    }
}
