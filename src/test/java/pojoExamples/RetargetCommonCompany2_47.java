package pojoExamples;

public class RetargetCommonCompany2_47 {
    public static void main(String[] args) {

        Employee2_47 rahul = new Employee2_47();
        rahul.setId(10);
        rahul.setDeptId(100);
        rahul.setAddress("KA");
        rahul.setGender("male");
        rahul.setMobNo("124679934");

        Employee2_47 avi = new Employee2_47();
        avi.setId(10);
        avi.setDeptId(100);
        avi.setAddress("KA");
        avi.setGender("male");
        avi.setMobNo("124679934");

        System.out.println(rahul.getId());
        System.out.println(avi.getId());

    }
}
