/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Taxes> taxes = new ArrayList<>();
            
            System.out.println("Company name:");
            String companyName = scanner.nextLine();
            Payments payment = new Payments(companyName);
            
            while (true) {
                System.out.println("Enter the type of tax (PIS or IPI) or 'stop' to finish:");
                String taxType = scanner.next();
                
                if (taxType.equalsIgnoreCase("stop")) {
                    break;
                }
                
                try {
                    if (taxType.equalsIgnoreCase("PIS")) {
                        System.out.println("Enter debit value:");
                        double debit = scanner.nextDouble();
                        System.out.println("Enter credit value:");
                        double credit = scanner.nextDouble();
                        
                        Taxes pis = new PIS(debit, credit);
                        taxes.add(pis);
                        payment.addTax(pis);
                        
                    } else if (taxType.equalsIgnoreCase("IPI")) {
                        System.out.println("Enter product value:");
                        double productValue = scanner.nextDouble();
                        System.out.println("Enter freight value:");
                        double freight = scanner.nextDouble();
                        System.out.println("Enter insurance value:");
                        double insurance = scanner.nextDouble();
                        System.out.println("Enter other expenses:");
                        double otherExpenses = scanner.nextDouble();
                        System.out.println("Enter rate:");
                        double rate = scanner.nextDouble();
                        
                        Taxes ipi = new IPI(productValue, freight, insurance, otherExpenses, rate);
                        taxes.add(ipi);
                        payment.addTax(ipi);
                        
                    } else {
                        System.out.println("Invalid tax type. Try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume invalid input to avoid infinite loop
                }
            }
            
            // Display all registered taxes
            for (Taxes tax : taxes) {
                System.out.println(tax.getDescription() + ": $" + tax.calculateTax());
            }
        }
    }
}
