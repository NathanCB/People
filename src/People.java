import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class People {
    static ArrayList<Person> people = new ArrayList<>();//an arraylist of person objects
    static HashMap<String, ArrayList<Person>> peopleMap = new HashMap<>();

    public People() {
    }

    public static void readAndSortFile() throws Exception {
        //read each line into an object arraylist
        File f = new File("people.csv");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Person p = new Person(columns[1], columns[2], columns[3], columns[4]);
            People.people.add(p);
            //System.out.println(p);
        }
        fileScanner.close();
    }

    public static void loadMap() {
        ArrayList<Person> peopleInCountryList;

        for(Person person : people){
            //need key --peopleMap-- to associate to person
            peopleInCountryList = peopleMap.get(person.country);
            if(peopleInCountryList == null){                            // does the list of the country exist
                peopleInCountryList = new ArrayList<Person>();          // if the country list does not exist create a new list
                peopleMap.put(person.country, peopleInCountryList);     //put the list in the map
            }
            peopleInCountryList.add(person);//for every person put them on the list




        }
        }
    }


