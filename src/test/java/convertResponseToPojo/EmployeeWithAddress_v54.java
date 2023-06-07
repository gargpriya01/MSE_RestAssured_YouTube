package convertResponseToPojo;

public class EmployeeWithAddress_v54 {
    private String firstName;
    private String lastName;
    private String profession;
    private int age;
    private double salary;
    private Address_v54 address;

    public Address_v54 getAddress() {
        return address;
    }

    public void setAddress(Address_v54 address) {
        this.address = address;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
