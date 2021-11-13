package hanifiamdev.com.application;

import hanifiamdev.com.data.Company;

public class CompanyApp {

    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Wahana Koding");

        Company.Employee employee = company.new Employee();
        employee.setName("Hanif Amrullah");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        
    }
}
