package ex.ex13;

import java.util.List;

class Ex131 {
    public static void main(String[] args) {
        Branch branch = new Branch("札幌");
        System.out.println(branch.getName());
        List<Employee> employees = branch.getEmployees();
        for (Employee employee:employees) {
            System.out.println(
                    employee + " " + employee.getAllSales() +
                    " " + employee.getSum() +
                    " " + employee.getAve());
        }
    }
}
