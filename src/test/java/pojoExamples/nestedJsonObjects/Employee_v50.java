package pojoExamples.nestedJsonObjects;

public class Employee_v50 {
    private String firstname;
    private String lastname;
    private String profession;
    private  Address_v50 address;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Address_v50 getAddress() {
        return address;
    }

    public void setAddress(Address_v50 address) {
        this.address = address;
    }

}
