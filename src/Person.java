public class Person {
Integer idNum;
String firstName;
String lastName;
String email;
String country;
String ipAdd;

    public Person(String firstName, String lastName, String email, String country) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return firstName + lastName + email + country;
    }


}
