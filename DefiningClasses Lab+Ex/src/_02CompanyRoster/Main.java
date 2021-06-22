package _02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String, Department> departmentMap = new HashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String dep = tokens[3];

            Employee employee;
            if (tokens.length == 4) {
                employee = new Employee(name, salary, position, dep);
            } else if (tokens.length == 6) {
                employee = new Employee(name, salary, position, dep,
                        tokens[4], Integer.parseInt(tokens[5]));
            } else {
                try {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, dep, age);
                } catch (NumberFormatException e) {
                    employee = new Employee(name, salary, position, dep, tokens[4]);
                }
            }


            departmentMap.putIfAbsent(dep, new Department(dep));
            departmentMap.get(dep).getEmployees().add(employee);

        }
        Department maxSalaryAverDep = departmentMap
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(s1 -> s1.getValue().getAvg()))
                .get()
                .getValue();
        System.out.printf("Highest Average Salary: %s%n", maxSalaryAverDep.getName());

      maxSalaryAverDep.getEmployees()
              .stream()
              .sorted((e1, e2) -> Double.compare(e2.getSalary(),e1.getSalary()))
              .forEach(System.out::println);


    }
}
