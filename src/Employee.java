public class Employee {

    String firstName;
    String lastName;
    String jobTitle;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public Employee(String firstName, String lastName, String jobTitle,
                    String email, String phoneNumber, double salary, int age){
        this.firstName = firstName;
        this.lastName =  lastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showEmployeesInfo(Employee employee){
        System.out.println("Имя сотрудника: " + firstName);
        System.out.println("Фамилия сотрудника: " + lastName);
        System.out.println("Должность сотрудника: " + jobTitle);
        System.out.println("Почта сотрудника: " + email);
        System.out.println("Номер телефона сотрудника: " + phoneNumber);
        System.out.println("Зарплата сотрудника: " + salary);
        System.out.println("Возраст сотрудника: " + age);
    }

}
