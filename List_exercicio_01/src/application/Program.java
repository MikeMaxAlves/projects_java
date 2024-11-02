package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int employeeCount = sc.nextInt();

        for (int i = 0; i <= employeeCount; i++) {
            System.out.println("Employee #" + i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.print("Insira o ID do funcionário que terá aumento salarial: ");
        int idToFind = sc.nextInt();

        Employee employee = findEmployeeById(employees, idToFind);

        if (employee != null) {
            double percentage = -1;
            boolean validPercentage = false;

            // Repetir até que uma porcentagem válida seja inserida
            do {
                System.out.print("Insira a porcentagem: ");
                if (sc.hasNextDouble()) {
                    percentage = sc.nextDouble();
                    if (percentage >= 0) {
                        validPercentage = true;
                        employee.increaseSalary(percentage);
                    } else {
                        System.out.println("Porcentagem inválida! A porcentagem deve ser um número positivo.");
                    }
                } else {
                    System.out.println("Entrada inválida! Por favor, insira um número.");
                    sc.next(); // Limpar a entrada inválida
                }
            } while (!validPercentage);

        } else {
            System.out.println("Este ID não existe!");
        }

        System.out.println("\nLista de funcionários:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Employee findEmployeeById(List<Employee> list, int id) {
        for (Employee emp : list) {
            if (emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }
}
