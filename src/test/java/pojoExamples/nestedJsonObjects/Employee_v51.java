package pojoExamples.nestedJsonObjects;

import java.util.List;

public class Employee_v51 {
    private String firstname;
    private String lastname;
    private String profession;

    private List<Address_v50> address;

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

    public List<Address_v50> getAddress() {
        return address;
    }

    public void setAddress(List<Address_v50> address) {
        this.address = address;
    }



}
