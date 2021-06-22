package _03companyroster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, List<Employee>> map = new HashMap<>();
        List<Employee> list = null;

        while (n-- > 0) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = null;
            if (input.length == 6) {
                employee = new Employee(name, salary,
                        position, department, input[4], Integer.parseInt(input[5]));
            } else if (input.length == 4) {
                employee = new Employee(name, salary,
                        position, department);
            } else if (input.length == 5) {
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary,
                            position, department, age);
                } catch (Exception e) {
                    employee = new Employee(name, salary,
                            position, department, input[4]);
                }
            }

            if (!map.containsKey(department)) {
                list = new ArrayList<>();
            } else {
                list = map.get(department);
            }
            list.add(employee);
            map.put(department, list);
        }

         map.entrySet().stream().sorted((a, b) -> {
            double avA = a.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(0);
            double avB = b.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(0);
            return Double.compare(avB, avA);
        }).limit(1).forEach(e -> {
             System.out.printf("Highest Average Salary: %s%n", e.getKey());
             e.getValue().stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                     .forEach(em -> System.out.println(em.toString()));
         });




    }
}
