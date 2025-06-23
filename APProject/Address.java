public class Address {
    String streetName;
    int postcode;
    String city;
    String state;

    public Address(String streetName, int postcode, String city, String state) {
        this.streetName = streetName;
        this.postcode = postcode;
        this.city = city;
        this.state = state;
    }

    public void getAddress() {
        System.out.println(streetName + "," + postcode + "," + city + "," + state);
    }

    /*
     * public void addressSetter(String street, int postcode, String city, String
     * state){
     * this.streetName = street;
     * this.postcode = postcode;
     * this.city = city;
     * this.state = state;
     * }
     */
}

