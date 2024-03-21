package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firms = {"Rolex", "Omega", "Casio"};
        String[][] firmBrandMapping = {{firms[0], "Submariner"}, {firms[0], "Oyster"}, {firms[1], "Speedmaster" }, {firms[1], "Seamaster"},
                {firms[2],"G-Shock"}, {firms[2], "ProTrek"}};
        ArrayList<String[]> customers = new ArrayList<>();

        System.out.println("Магазин часов 'Тик-Так'");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nВведите данные покупателя для заказа " + (i + 1) + ":");
            System.out.print("ФИО: ");
            String fullName = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Номер телефона: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Доступные позиции в магазине:");
            for (String[] mapping : firmBrandMapping) {
                System.out.println(mapping[0] + " - " + mapping[1]);
            }

            System.out.print("Введите позицию (Фирма Марка): ");
            String positionInput = scanner.nextLine();
            String[] position = positionInput.split(" ");
            int quantity = 0;
            while (quantity <= 0) {
                System.out.print("Введите количество: ");
                quantity = scanner.nextInt();
                scanner.nextLine(); 
            }

            String[] customerData = {fullName, email, phoneNumber, position[0], position[1], String.valueOf(quantity)};
            customers.add(customerData);
        }

        System.out.println("\nЗаказы покупателей:");
        for (int i = 0; i < customers.size(); i++) {
            String[] customer = customers.get(i);
            System.out.println("Заказ " + (i + 1) + ":");
            System.out.println("Покупатель: " + customer[0]);
            System.out.println("Email: " + customer[1]);
            System.out.println("Номер телефона: " + customer[2]);
            System.out.println("Позиция: " + customer[3] + " - " + customer[4]);
            System.out.println("Количество: " + customer[5]);
            System.out.println();
        }
    }
}