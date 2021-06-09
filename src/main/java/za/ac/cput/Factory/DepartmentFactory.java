package za.ac.cput.Factory;

import za.ac.cput.Entity.Department;

public class DepartmentFactory {

    public static Department departmentChosen(String depCode, String depName, int officeNo){

        Department department = new Department.Builder()
                .setDepCode(depCode)
                .setDepName(depName)
                .setOfficeNo(officeNo)
                .build();

        return department;
    }
}
