public class Employees {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "Ivanov", "Engineer", "ivanov@gmail.com",
                "12345678", 34.32, 35);
        employees[1] = new Employee("Petrov", "Petrov", "Accountant", "Petrov@gmail.com",
                "467348468", 1235.45, 43);
        employees[2] = new Employee("Fedor", "Fedorov", "Boss", "fedorov@gmail.com",
                "45846869569", 12300.656, 37);
        employees[3] = new Employee("Maria", "Sidorova", "Cleaner", "sidorova@gmail.com",
                "4685795678", 654.123, 21);
        employees[4] = new Employee("Olga", "Orlova", "Analyst", "orlova@gmail.com",
                "4468568", 4357.63, 47);
    }

}
