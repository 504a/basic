package ex.ex13;

class Ex13 {
    public static void main(String[] args) {
        //Employeeクラスのインスタンスを作る
        Employee employee = new Employee(1,"やまだ","男",35);
        //表示する
        System.out.println(employee);
        employee.setSales(1,500);
        System.out.println(employee.getSales(1));
    }
}
