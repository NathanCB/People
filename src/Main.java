public class Main {

    public static void main(String[] args) throws Exception{
        People peopleMatchingCountries = new People();

        peopleMatchingCountries.readAndSortFile();
        peopleMatchingCountries.loadMap();
        peopleMatchingCountries.sortByLastName();
        peopleMatchingCountries.printMapToConsole();
        peopleMatchingCountries.writeMapToJson();
    }
}
