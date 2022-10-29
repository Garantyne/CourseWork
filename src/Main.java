public class Main {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];
        Employees [0] = new Employee("Ivan","Ivanovich","Ivanov",
                10000,1);
        Employees [1] = new Employee("Petor","Petrovich","Petrov",
                11000,2);
        Employees [2] = new Employee("Zahar","Zaharovich","Zaharov",
                12000,3);
        Employees [3] = new Employee("Pendos","Pendosovich","Pendosov",
                13000,4);
        Employees [4] = new Employee("Vasili","Vasilievich","Vasilev",
                14000,5);

        Show.EmployyesShow(Employees);
        System.out.println("Суммарная зарплата " + Show.summSelory(Employees));
        System.out.println("минимальная зарплата у " + Show.minSelory(Employees));
        System.out.println("максимальная зарплата у " + Show.maxSelory(Employees));
        System.out.println("Средняя зарплата  " + Show.middleSelory(Employees));
        Show.namesOfEmployees(Employees);

    }
}